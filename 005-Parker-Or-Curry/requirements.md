# Exercice 005 - Stephen Curry ou Tony Parker : Les opérateurs relationnels

## Objectif
À la fin de cet exercice, vous serez en mesure de comprendre et d'appliquer les opérateurs relationnels en Java pour comparer des variables et prendre des décisions.

## Expression du besoin
Veuillez vous référer au sujet publié sur la plateforme de votre abonnement.

## Modèle
Si vous ne savez pas par où commencer :

```java
    public class CurryOuParker {
        public static void main(String[] args) {
           
        }
    }
```

## Astuce
Pour comparer les tailles de Stephen Curry et de Tony Parker, vous devez d'abord convertir les deux mesures dans la même unité.
Vous pouvez convertir la taille de Stephen Curry de pieds en millimètres en utilisant le facteur de conversion 1 pied = 304,8 mm.
Une fois que les deux tailles sont dans la même unité, vous pouvez utiliser un opérateur relationnel pour les comparer et déterminer si l'affirmation "Stephen Curry est plus grand que Tony Parker" est true ou false.

## Explications
1. Conversion des unités : La première étape consiste à convertir la taille de Stephen Curry en centimètres afin de pouvoir la comparer à celle de Tony Parker. Le facteur de conversion est de 1 pied = 304,8 mm.
    - Formule : Taille de Stephen Curry en mm = 6,3 ft * 304,8 mm/ft

2. Comparaison : Après avoir converti la taille dans la même unité, nous utilisons un opérateur relationnel pour comparer les deux tailles.
    - Formule : Taille de Stephen Curry en mm > Taille de Tony Parker en mm