# Implementation de la recherche d'architecte par id

### Statut : Approuvé

## Contexte

> Pour la recherche de nos consultant architecte nous avons décider d'utiliser l'id comme paramètre de recherche en
> premier pour faire une requête bien isolé en base de donnée.
> Notre architecture hexagonal reste la même et on va s'inspirer de nos use case précédent avec le pattern CQS pour
> incrémenter notre kernel d'un QueryBus qui va nous permettre
> comme pour le CommandBus de faire une action de type Query (HTTP : GET).

### Decision

> Pour cela nous allons incrémenter notre kernel pour qu'il devienne plus riche et qu'il accueil maintenant les Query de
> notre application.

## Raisonnement

> Pour ce faire c'est similaire au CommandBus on va répliquer la logique mais avec les Query pour bien séparer les
> responsabilités (patterne CQS).

#### Implications

> L'incrémentation du kernet se révèle assez simple grâce a l'implémentation auparavant avec le CommandBus.

## Conclusion

> L'incrémentation de ce kernel à été accepté par tous et après implémentation de ce cas d'usage on peux voir tout les
> avantages que le noyau (kernel) apporte au niveau de l'application.