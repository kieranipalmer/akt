//[akt](../../../index.md)/[dev.shanty.akt.actor.manager](../index.md)/[ActorManager](index.md)

# ActorManager

[jvm]\
interface [ActorManager](index.md)

## Functions

| Name | Summary |
|---|---|
| [startActor](start-actor.md) | [jvm]<br>abstract fun &lt;[TIN](start-actor.md), [TOUT](start-actor.md)&gt; [startActor](start-actor.md)(inboxBuilder: () -&gt; Channel&lt;[TIN](start-actor.md)&gt; = { Channel() }, outboxBuilder: () -&gt; Channel&lt;[TOUT](start-actor.md)&gt; = { Channel() }, process: suspend [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-actor.md), [TOUT](start-actor.md)&gt;.([TIN](start-actor.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-actor.md), [TOUT](start-actor.md)&gt; |
| [startUniqueActorByName](start-unique-actor-by-name.md) | [jvm]<br>abstract fun &lt;[TIN](start-unique-actor-by-name.md), [TOUT](start-unique-actor-by-name.md)&gt; [startUniqueActorByName](start-unique-actor-by-name.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), inboxBuilder: () -&gt; Channel&lt;[TIN](start-unique-actor-by-name.md)&gt; = { Channel() }, outboxBuilder: () -&gt; Channel&lt;[TOUT](start-unique-actor-by-name.md)&gt; = { Channel() }, process: suspend [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-unique-actor-by-name.md), [TOUT](start-unique-actor-by-name.md)&gt;.([TIN](start-unique-actor-by-name.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-unique-actor-by-name.md), [TOUT](start-unique-actor-by-name.md)&gt; |

## Inheritors

| Name |
|---|
| [LocalActorManager](../../dev.shanty.akt.actor.manager.local/-local-actor-manager/index.md) |
