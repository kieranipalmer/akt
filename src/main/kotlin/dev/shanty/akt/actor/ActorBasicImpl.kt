package dev.shanty.akt.actor

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.shareIn
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

internal class ActorBasicImpl <TIN, TOUT>(
    context: CoroutineContext,
    private val inbox: Channel<TIN> = Channel(),
    private val outboxChannel: Channel<TOUT> = Channel(),
    val process: suspend Actor<TIN, TOUT>.(TIN) -> Unit,
) : Actor<TIN, TOUT>, CoroutineScope by CoroutineScope(context) {
    override val outbox = outboxChannel.receiveAsFlow().shareIn(this, SharingStarted.Eagerly, 0)
    override suspend fun sendTo(it: TIN) = inbox.send(it)
    override suspend fun emit(it: TOUT) = outboxChannel.send(it)

    init {
        launch {
            inbox.receiveAsFlow().onEach {
                process(it)
            }.collect()
        }
    }
}
