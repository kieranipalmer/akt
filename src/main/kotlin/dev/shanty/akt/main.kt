package dev.shanty.akt

import dev.shanty.akt.actor.actor
import dev.shanty.akt.actor.manager.local.localActorSystem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.isActive
import kotlinx.coroutines.runBlocking

fun main() = runLocalActorSystem {
    val test = actor<Pair<Int, Int>, Int> { (x, y) ->
        emit(x + y)
    }

    while (isActive) {
        val x = readln().toInt()
        val y = readln().toInt()
        test.sendTo(Pair(x, y))
        println(test.outbox.first())
    }
}

fun runLocalActorSystem(f: suspend CoroutineScope.() -> Unit) = runBlocking {
    localActorSystem {
        f()
    }
}
