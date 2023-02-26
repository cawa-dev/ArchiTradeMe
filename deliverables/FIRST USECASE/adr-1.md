# Implementation de l'inscription de l'architecte

### Statut : Approuvé

## Contexte

> Pour l'inscription de notre consultant architect nous avons décider d'utiliser notre architecture hexagonal déjà en
> vigueur et de l'incrémenter d'un noyau (kernel) qui nous permet de facilité l'interaction avec le controller qui
> dirige
> l'application.

### Decision

> Nous implémenterons notre case d'usage avec un Command Bus qui va nous permettre de poster nos Command qui sont l'
> entrée dans notre application.

## Raisonnement

> Grâce a ce kernel nous allons pouvoir simplifier tout le boilerplate code qui intervenait dans l'application pour que
> les adapters de direction appel l'application.

#### Implications

> L'implémetation de ce kernel demande à certain niveau de maturité au niveau du langage Java.

## Conclusion

> L'implémentation de ce kernel à été accepté par tous et après implémentation de ce cas d'usage on peux voir tout les avantages que le noyau (kernel) apporte au niveau de
> l'application.