package dev.shanty.akt.actor.manager.local

import dev.shanty.akt.actor.Actor
import dev.shanty.akt.actor.ActorBasicImpl
import dev.shanty.akt.actor.manager.ActorManager
import dev.shanty.akt.actor.manager.ActorManagerContextElement
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.job
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.coroutines.CoroutineContext

class LocalActorManager(context: CoroutineContext, private val logger: Logger = LoggerFactory.getLogger(LocalActorManager::class.java)) : ActorManager {
    private val actorContext = SupervisorJob(context.job) + CoroutineExceptionHandler { _, throwable ->
        logger.error("Actor failed", throwable)
    } + context + ActorManagerContextElement(this)

    // TODO This should really be a concurrency safe structure or another actor
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
