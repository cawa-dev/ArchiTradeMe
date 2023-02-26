# Construire une application d'architecture hexagonale avec Java

### Statut : Approuvé

## Contexte

> Nous construisons une nouvelle application qui nécessite une architecture flexible, évolutive et maintenable. Nous
> avons décidé d'utiliser le modèle d'architecture hexagonale, également appelé ports et adaptateurs, qui isole le cœur
> de
> l'application de l'infrastructure et des systèmes externes. Notre équipe de développement maîtrise Java et nous avons
> décidé de l'utiliser pour implémenter l'application.

### Decision

> Nous implémenterons l'application en utilisant le modèle d'architecture hexagonale avec Java.

## Raisonnement

> L'utilisation du modèle Hexagonal Architecture avec Java pour notre application présente plusieurs avantages.

#### Séparation des responsabilités :

> Le modèle d'architecture hexagonale sépare le cœur de l'application de l'infrastructure et des systèmes externes. Cela
> facilite le test, la maintenance et la mise à l'échelle de l'application.

#### La flexibilité :

> L'application peut facilement s'adapter aux changements d'exigences et de systèmes externes en échangeant des
> adaptateurs.

#### Testabilité:

> L'application est hautement testable en raison de sa séparation claire des responsabilités et de l'utilisation des
> interfaces.

#### Maintenabilité:

> L'application est hautement maintenable en raison de sa structure modulaire et de la séparation des responsabilités.

#### Alternatives

> Nous avons considéré d'autres modèles d'architecture tels que Model-View-Controller (MVC) et Model-View-ViewModel (
> MVVM), mais ils n'offrent pas le même niveau de séparation des resposabilités et de flexibilité que le modèle d'
> architecture hexagonale.
>> Nous avons également envisagé d'utiliser d'autres langages de programmation tels que Python et Node.js, mais nous
> > avons décidé d'utiliser Java en raison de la maîtrise de notre équipe et des bibliothèques et outils disponibles.

#### Implications

> L'implémentation du modèle d'architecture hexagonale avec Java nécessite une bonne compréhension du modèle et de ses
> détails d'implémentation. Cela nécessite également des efforts supplémentaires pour définir des interfaces claires et
> des responsabilités distinctes.
>> Nous devrons choisir et configurer les bibliothèques et outils appropriés pour implémenter le modèle d'architecture
> > hexagonale avec Java. Nous devrons également former notre équipe de développement sur le modèle et sa mise en œuvre.

## Conclusion

> Après un examen attentif des avantages et des implications, nous avons décidé d'implémenter l'application en utilisant
> le modèle d'architecture hexagonale avec Java et le framework Spring. Cette décision nous fournit une architecture
> flexible, évolutive et
> maintenable qui peut facilement s'adapter aux changements des exigences et des systèmes externes. Cette décision a été
> approuvée par les parties prenantes impliquées dans le projet.