//[akt](../../index.md)/[dev.shanty.akt.actor.manager](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [ActorManager](-actor-manager/index.md) | [jvm]<br>interface [ActorManager](-actor-manager/index.md) |
| [NoActorManagerRegisteredException](-no-actor-manager-registered-exception/index.md) | [jvm]<br>class [NoActorManagerRegisteredException](-no-actor-manager-registered-exception/index.md) : [Exception](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html) |

## Functions

| Name | Summary |
|---|---|
| [startActorSystem](start-actor-system.md) | [jvm]<br>suspend fun [startActorSystem](start-actor-system.md)(manager: [ActorManager](-actor-manager/index.md), init: suspend CoroutineScope.() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [actorManager](actor-manager.md) | [jvm]<br>val [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html).[actorManager](actor-manager.md): [ActorManager](-actor-manager/index.md)val CoroutineScope.[actorManager](actor-manager.md): [ActorManager](-actor-manager/index.md) |
