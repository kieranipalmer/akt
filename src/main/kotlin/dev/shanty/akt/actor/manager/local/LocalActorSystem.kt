package dev.shanty.akt.actor.manager.local

import dev.shanty.akt.actor.manager.startActorSystem
import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.coroutineContext

suspend fun localActorSystem(init: suspend CoroutineScope.() -> Unit) = startActorSystem(
    LocalActorManager(
        coroutineContext
    ),
    init
)