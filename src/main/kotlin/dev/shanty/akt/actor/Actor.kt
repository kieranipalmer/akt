package dev.shanty.akt.actor

import dev.shanty.akt.actor.manager.actorManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow

interface Actor<TIN, TOUT> : CoroutineScope {
    val outbox: Flow<TOUT>
    suspend fun sendTo(it: TIN)
    suspend fun emit(it: TOUT)
}

fun <TIN, TOUT> CoroutineScope.actor(
    inboxBuilder: () -> Channel<TIN> = { Channel() },
    outboxBuilder: () -> Channel<TOUT> = { Channel() },
    process: suspend Actor<TIN, TOUT>.(TIN) -> Unit,
): Actor<TIN, TOUT> = actorManager.startActor(inboxBuilder, outboxBuilder, process)
