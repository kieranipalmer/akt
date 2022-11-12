package dev.shanty.akt.actor.manager

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.withContext

suspend fun startActorSystem(manager: ActorManager, init: suspend CoroutineScope.() -> Unit) {
    withContext(ActorManagerContextElement(manager)) {
        init()
    }
}