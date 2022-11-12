package dev.shanty.akt.actor.manager

import dev.shanty.akt.actor.Actor
import kotlinx.coroutines.channels.Channel

interface ActorManager {
    fun <TIN, TOUT> startActor(
        inboxBuilder: () -> Channel<TIN> = { Channel() },
        outboxBuilder: () -> Channel<TOUT> = { Channel() },
        process: suspend Actor<TIN, TOUT>.(TIN) -> Unit,
    ): Actor<TIN, TOUT>

    fun <TIN, TOUT> startUniqueActorByName(
        name: String,
        inboxBuilder: () -> Channel<TIN> = { Channel() },
        outboxBuilder: () -> Channel<TOUT> = { Channel() },
        process: suspend Actor<TIN, TOUT>.(TIN) -> Unit,
    ): Actor<TIN, TOUT>
}
