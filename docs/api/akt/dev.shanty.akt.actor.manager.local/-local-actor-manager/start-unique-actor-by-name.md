//[akt](../../../index.md)/[dev.shanty.akt.actor.manager.local](../index.md)/[LocalActorManager](index.md)/[startUniqueActorByName](start-unique-actor-by-name.md)

# startUniqueActorByName

[jvm]\
open override fun &lt;[TIN](start-unique-actor-by-name.md), [TOUT](start-unique-actor-by-name.md)&gt; [startUniqueActorByName](start-unique-actor-by-name.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), inboxBuilder: () -&gt; Channel&lt;[TIN](start-unique-actor-by-name.md)&gt;, outboxBuilder: () -&gt; Channel&lt;[TOUT](start-unique-actor-by-name.md)&gt;, process: suspend [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-unique-actor-by-name.md), [TOUT](start-unique-actor-by-name.md)&gt;.([TIN](start-unique-actor-by-name.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-unique-actor-by-name.md), [TOUT](start-unique-actor-by-name.md)&gt;
