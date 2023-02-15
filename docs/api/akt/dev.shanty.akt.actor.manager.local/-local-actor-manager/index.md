//[akt](../../../index.md)/[dev.shanty.akt.actor.manager.local](../index.md)/[LocalActorManager](index.md)

# LocalActorManager

[jvm]\
class [LocalActorManager](index.md)(context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html), logger: Logger = LoggerFactory.getLogger(LocalActorManager::class.java)) : [ActorManager](../../dev.shanty.akt.actor.manager/-actor-manager/index.md)

## Constructors

| | |
|---|---|
| [LocalActorManager](-local-actor-manager.md) | [jvm]<br>fun [LocalActorManager](-local-actor-manager.md)(context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html), logger: Logger = LoggerFactory.getLogger(LocalActorManager::class.java)) |

## Functions

| Name | Summary |
|---|---|
| [startActor](start-actor.md) | [jvm]<br>open override fun &lt;[TIN](start-actor.md), [TOUT](start-actor.md)&gt; [startActor](start-actor.md)(inboxBuilder: () -&gt; Channel&lt;[TIN](start-actor.md)&gt;, outboxBuilder: () -&gt; Channel&lt;[TOUT](start-actor.md)&gt;, process: suspend [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-actor.md), [TOUT](start-actor.md)&gt;.([TIN](start-actor.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-actor.md), [TOUT](start-actor.md)&gt; |
| [startUniqueActorByName](start-unique-actor-by-name.md) | [jvm]<br>open override fun &lt;[TIN](start-unique-actor-by-name.md), [TOUT](start-unique-actor-by-name.md)&gt; [startUniqueActorByName](start-unique-actor-by-name.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), inboxBuilder: () -&gt; Channel&lt;[TIN](start-unique-actor-by-name.md)&gt;, outboxBuilder: () -&gt; Channel&lt;[TOUT](start-unique-actor-by-name.md)&gt;, process: suspend [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-unique-actor-by-name.md), [TOUT](start-unique-actor-by-name.md)&gt;.([TIN](start-unique-actor-by-name.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-unique-actor-by-name.md), [TOUT](start-unique-actor-by-name.md)&gt; |
