# Exercice 025 - Bataille pour la Terre du Milieu - Des méthodes qui référencent des objets

## Objectif
Nous allons reprendre l'exercice précédent en utilisant le formattage de chaîne pour combiner des chaînes et des variables en Java.

## Expression du besoin
Veuillez vous référer au sujet publié sur la plateforme de votre abonnement.

## Modèle
Si vous ne savez pas par où commencer :

```java
public class BatailleTerreDuMilieu {

    public static void main(String[] args) {


        

        
    }
    
}
```
```java
public class Arme {

}
```

```java
public class Combattant {

    
}
```


## Explications
La trilogie du Seigneur des Anneaux compte un grand nombre de batailles. Les champs de bataille de la Terre du Milieu sont le théâtre d'affrontements entre de nombreux combattants venant de divers horizons. On peut donc trouver des hobbits (même s'ils sont peu habiles pour le combat), des humains, des nains, des elfs, des orcs, des magiciens...

Chaque combattant possède des caractéristiques qui lui sont propres comme par exemple un certain niveau de vie.  

De plus, on peut aussi trouver sur un champ de bataille des combattants capables d'apporter des soins. Généralement ces combattants ne sont pas les plus aptes au combat et vont se contenter de soigner les blessés.

Le but de l’exercice consiste à créer 2 combattants et leur arme respective et de simuler un combat entre ces 2 combattants (il serait trop long de simuler une bataille entière !).

Nous allons créer une classe ``Arme`` caractérisée par :

- un ``type  `` (EPEE, HACHE, ARC...) qui est un ``String ``

- les ``degat `` que l'arme peut infliger et de type ``int ``

Une autre classe intitulée ``Combattant`` avec :

- un `` type``, (HUMAIN, ORC, NAIN...)  qui est un ``String ``

- un ``niveauDeVie `` de type ``int ``

- une ``arme `` qui est de type ``Arme ``

Dans la classe combattant nous allons créer une méthode ``saisirArme `` avec en paramètre une arme afin que le combattant puisse être apte à attaquer un ennemi sinon l’attaque est impossible.

Nous allons aussi ajouter une méthode ``attaquer `` avec en paramètre le combattant du
camp ennemi.

Enfin une deuxième méthode ``soigner`` du combattant va permettre de soigner un allié qui sera aussi passé en paramètre de la fonction. Un soigneur ne peut ajouter que 10 points de vie à un allié.

**Faites bien attention à vérifier que l’attaquant possède une arme pour infliger des dégâts à son ennemi.**

Nous allons simuler un combat entre un HUMAIN et un ORC. Dans la trilogie ce sont les humains qui sortent victorieux donc  l'HUMAIN gagnera le duel. Lorsque l'ORC n'a plus de points de vie, nous affichons le message suivant :

«HUMAIN a vaincu le combattant ORC ».

Libre à vous de créer le déroulement du combat entre un HUMAIN et un ORC pour arriver à ce message. Vous pouvez également créer les armes que vous voulez. 

##
Visionnez les cours théoriques relatifs à cet exercice en utilisant 
les liens ci-dessous (Vous bénéficierez d'un tarif préférentiel si vous 
n'êtes pas déjà inscrit) :

- [Des méthodes qui référencent des objets](https://www.udemy.com/cours-complet-de-programmation-java-pour-debutants/learn/v4/t/lecture/5991160/?couponCode=FROM_TP_JAVA)