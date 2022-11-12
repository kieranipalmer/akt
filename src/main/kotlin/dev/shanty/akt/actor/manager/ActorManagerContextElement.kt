package dev.shanty.akt.actor.manager

import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext

internal class ActorManagerContextElement(val manager: ActorManager) : CoroutineContext.Element {
    override val key: CoroutineContext.Key<*> = Key
    companion object Key : CoroutineContext.Key<ActorManagerContextElement>
}

val CoroutineContext.actorManager: ActorManager get() = get(ActorManagerContextElement)?.manager ?: throw NoActorManagerRegisteredException()
val CoroutineScope.actorManager: ActorManager get() = coroutineContext.actorManager
class NoActorManagerRegisteredException : Exception("No Actor Manager was registered")
