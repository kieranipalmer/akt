package dev.shanty.akt.actor.manager.local

import dev.shanty.akt.actor.Actor
import dev.shanty.akt.actor.ActorBasicImpl
import dev.shanty.akt.actor.manager.ActorManager
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.Channel
import kotlin.coroutines.CoroutineContext

class LocalActorManager(context: CoroutineContext) : ActorManager {
    private val actorContext = SupervisorJob() + context

    //TODO This should really be a concurrency safe structure or another actor
    private val uniqueActors = mutableMapOf<String, Actor<*, *>>()

    override fun <TIN, TOUT> startActor(
        inboxBuilder: () -> Channel<TIN>,
        outboxBuilder: () -> Channel<TOUT>,
        process: suspend Actor<TIN, TOUT>.(TIN) -> Unit
    ): Actor<TIN, TOUT> = ActorBasicImpl(actorContext, inboxBuilder(), outboxBuilder(), process)

    override fun <TIN, TOUT> startUniqueActorByName(
        name: String,
        inboxBuilder: () -> Channel<TIN>,
        outboxBuilder: () -> Channel<TOUT>,
        process: suspend Actor<TIN, TOUT>.(TIN) -> Unit
    ) = uniqueActors.getOrPut(name) {
        startActor(inboxBuilder, outboxBuilder, process)
    } as Actor<TIN, TOUT>
}