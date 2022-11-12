//[akt](../../index.md)/[dev.shanty.akt.actor](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [Actor](-actor/index.md) | [jvm]<br>interface [Actor](-actor/index.md)&lt;[TIN](-actor/index.md), [TOUT](-actor/index.md)&gt; : CoroutineScope |

## Functions

| Name | Summary |
|---|---|
| [actor](actor.md) | [jvm]<br>fun &lt;[TIN](actor.md), [TOUT](actor.md)&gt; CoroutineScope.[actor](actor.md)(inboxBuilder: () -&gt; Channel&lt;[TIN](actor.md)&gt; = { Channel() }, outboxBuilder: () -&gt; Channel&lt;[TOUT](actor.md)&gt; = { Channel() }, process: suspend [Actor](-actor/index.md)&lt;[TIN](actor.md), [TOUT](actor.md)&gt;.([TIN](actor.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Actor](-actor/index.md)&lt;[TIN](actor.md), [TOUT](actor.md)&gt; |
