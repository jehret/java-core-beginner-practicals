# Exercice 006 - Recherche locataire et appartement - Les opérateurs logiques

## Objectif
Cet exercice vous permettra d'utiliser les opérateurs logiques en Java pour résoudre des problèmes de la vie courante.

## Expression du besoin
Veuillez vous référer au sujet publié sur la plateforme de votre abonnement.

## Modèle
Si vous ne savez pas par où commencer :

```java
    public class LocatairesEtAppartements {
    
       public static void main(String[] args) {
           
           //Appartement
           int surface = 100;
           int nbPiece = 3;
           int loyer = 700;
           boolean cuisineEquipe = false;
           boolean balcon = false;
           boolean parking = true;
   
           //Dossier locataire
           int salaireMensuelNet = 1000;
           boolean cdi = false;
           boolean garant = true;
           int salaireGarant = 3000;
       }
   }
```

## Astuce
Pour résoudre cet exercice, vous devrez utiliser des instructions conditionnelles (`if`-`else`) afin d'évaluer plusieurs critères pour l'appartement et le locataire.
Utilisez des opérateurs logiques tels que `&&` (ET) et `||` (OU) pour combiner les conditions.
Par exemple, pour vérifier si l'appartement répond à la première série de critères, vous pouvez utiliser une condition telle que (`surface > 80 && piecesNb > 2 && loyer <= 700`). 
De même, créez des conditions pour la candidature du locataire.