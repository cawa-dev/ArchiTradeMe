# Implementation de la mise à jour du profile de l'architecte

### Statut : Approuvé

## Contexte

> Pour la mise à jour du profile de notre consultant architecte nous avons décider d'utiliser notre architecture
> hexagonal et de s'inspirer de notre premier use case pour batir une structure proche du kernel qui me permet de
> construitre notre application très rappidement.

### Decision

> Nous implémenterons notre case d'usage avec un Command Bus comme avec le cas d'usage précédent qui va nous permettre
> de poster nos Command qui sont l'
> entrée dans notre application.

## Raisonnement

> Grâce a ce kernel encore nous allons pouvoir simplifier tout le boilerplate code (code usinée, code non simple,
> procédurale) qui intervenait dans l'application pour que
> les adapters de direction appel l'application.

#### Implications

> L'implémetation de ce kernel demande à certain niveau de maturité au niveau du langage Java.

## Conclusion

> L'implémentation de ce kernel à été accepté par tous et après implémentation de ce cas d'usage on peux voir tout les
> avantages que le noyau (kernel) apporte au niveau de
> l'application.