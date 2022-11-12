//[akt](../../../index.md)/[dev.shanty.akt.actor.manager.local](../index.md)/[LocalActorManager](index.md)/[startActor](start-actor.md)

# startActor

[jvm]\
open override fun &lt;[TIN](start-actor.md), [TOUT](start-actor.md)&gt; [startActor](start-actor.md)(inboxBuilder: () -&gt; Channel&lt;[TIN](start-actor.md)&gt;, outboxBuilder: () -&gt; Channel&lt;[TOUT](start-actor.md)&gt;, process: suspend [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-actor.md), [TOUT](start-actor.md)&gt;.([TIN](start-actor.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Actor](../../dev.shanty.akt.actor/-actor/index.md)&lt;[TIN](start-actor.md), [TOUT](start-actor.md)&gt;
