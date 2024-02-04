# Exercice 020 - Combien de secondes se sont écoulées au 21ème siècle : Arguments et valeur de retour d'une méthode

## Objectif
Nous allons reprendre l'exercice précédent en utilisant le formattage de chaîne pour combiner des chaînes et des variables en Java.

## Expression du besoin
Veuillez vous référer au sujet publié sur la plateforme de votre abonnement.

## Modèle
Si vous ne savez pas par où commencer :

```java
public class SecondesAu21emeSiecle {
    
    public static void main(String... args){
        
    }

}
```

## Explications
Prérequis : Pour les étudiants du "Cours complet de programmation Java pour débutants", veuillez noter qu'il faudra avoir dépassé la Session 62 pour réaliser cet exercice.

Nous allons créer une classe ``Personne ``, qui représente une personne comme vous pouvez l'imaginer.

Cette personne aura un ``nom ``, c'est un ``String ``. 

La classe ``Personne``  disposera également d'une propriété ``voisin``  également de type ``Personne ``. Il s'agira d'y mettre le voisin de la personne en question. 

La classe disposera également d'une méthode ``sePresenter``  sans paramètre et une méthode ``sePresenter`` qui va surcharger la précédente en prenant en paramètre une autre personne. Les 2 méthodes retourneront ``void ``.

La méthode sans paramètre doit afficher : 

"Bonjour je m'appelle X ! Et toi comment t'appelles-tu ?"

Où **X** est le nom de la personne qui se présente.

La méthode avec paramètre doit afficher :

"Bonjour Y ! Je m'appelle X. Et toi comment t'appelles-tu ?"

Où **X** est le nom de la personne qui se présente et **Y** le nom de la personne reçue en paramètre.

Dans tous les cas, après avoir affiché le message, si la personne à un voisin, elle devra invoquer ``sePresenter``  de son voisin, en se passant lui-même en paramètre.

Dans le ``main``  de la classe exécutable, vous allez construire une chaîne de l'amitié de 5 personnes qui vont tour à tour se présenter.

Le résultat devrait être quelque chose comme ça :

*Bonjour je m'appelle René ! Et toi comment t'appelles-tu ?*

*Bonjour René ! Je m'appelle Julien. Et toi comment t'appelles-tu ?*

*Bonjour Julien ! Je m'appelle Lisa. Et toi comment t'appelles-tu ?*

*Bonjour Lisa ! Je m'appelle Lola. Et toi comment t'appelles-tu ?*

*Bonjour Lola ! Je m'appelle Cyrille.*

##
Visionnez les cours théoriques relatifs à cet exercice en utilisant 
les liens ci-dessous (Vous bénéficierez d'un tarif préférentiel si vous 
n'êtes pas déjà inscrit) :

- [Arguments et valeur de retour d'une méthode](https://www.udemy.com/cours-complet-de-programmation-java-pour-debutants/learn/v4/t/lecture/5991160/?couponCode=FROM_TP_JAVA)