//[akt](../../../index.md)/[dev.shanty.akt.actor](../index.md)/[Actor](index.md)

# Actor

[jvm]\
interface [Actor](index.md)&lt;[TIN](index.md), [TOUT](index.md)&gt; : CoroutineScope

## Functions

| Name | Summary |
|---|---|
| [emit](emit.md) | [jvm]<br>abstract suspend fun [emit](emit.md)(it: [TOUT](index.md)) |
| [sendTo](send-to.md) | [jvm]<br>abstract suspend fun [sendTo](send-to.md)(it: [TIN](index.md)) |

## Properties

| Name | Summary |
|---|---|
| [coroutineContext](index.md#-1654120400%2FProperties%2F-1216412040) | [jvm]<br>abstract val [coroutineContext](index.md#-1654120400%2FProperties%2F-1216412040): [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) |
| [outbox](outbox.md) | [jvm]<br>abstract val [outbox](outbox.md): Flow&lt;[TOUT](index.md)&gt; |

## Extensions

| Name | Summary |
|---|---|
| [actor](../actor.md) | [jvm]<br>fun &lt;[TIN](../actor.md), [TOUT](../actor.md)&gt; CoroutineScope.[actor](../actor.md)(inboxBuilder: () -&gt; Channel&lt;[TIN](../actor.md)&gt; = { Channel() }, outboxBuilder: () -&gt; Channel&lt;[TOUT](../actor.md)&gt; = { Channel() }, process: suspend [Actor](index.md)&lt;[TIN](../actor.md), [TOUT](../actor.md)&gt;.([TIN](../actor.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Actor](index.md)&lt;[TIN](../actor.md), [TOUT](../actor.md)&gt; |
| [actorManager](../../dev.shanty.akt.actor.manager/actor-manager.md) | [jvm]<br>val CoroutineScope.[actorManager](../../dev.shanty.akt.actor.manager/actor-manager.md): [ActorManager](../../dev.shanty.akt.actor.manager/-actor-manager/index.md) |
