# Exercice 011 - Gains du Loto, Version 2 : Utiliser if, else if et else

## Objectif
L'objectif d'apprentissage de cet exercice est de comprendre comment utiliser if, else if et else en Java dans une logique conditionnelle plus complexe.

## Expression du besoin
Veuillez vous référer au sujet publié sur la plateforme de votre abonnement.

## Modèle
Si vous ne savez pas par où commencer :

```java
public class LotoElseIf {
    public static void main(String[] args) {
        int factureElectricite = 341;
    }
}
```

## Astuce
1. Commencez par définir des variables pour chaque montant, en incluant cette fois les impôts et le billet de 50 Euros.
2. Calculer le montant total restant après paiement des impôts et avec le billet de 50 Euro.
3. Utilisez les mots clé `if`-`else if`-`else` pour vérifier les conditions suivantes :
- Si vous avez assez d'argent pour acheter la voitures avec toutes les options, afficher le 1er message.
- Dans le cas contraire, mais si en revanche vous pouvez vous offrir la voiture sans les options, affichez le second message.
- Enfin, si vous ne pouvez pas vous offrir la voiture même sans les options, affichez le 3ème message.

Pensez bien à remplacer les "<>" dans les messages par les montants réels.

## Explications
Le code calcule le montant restant après toutes dépenses, en suivant la même logique que dans l'exercice précédent. 
Il décide détermine ensuite si vous pouvez ou non vous offrir la voiture avec les options ou non.

Le code utilise les mots clé `if`, `else if` et `else` pour réagir en fonction des différents scenarii:

- Si vous avez assez d'argent pour acheter la voiture avec les options, affichez le 1er message incluant le montant restant.
- Dans le cas contraire, mais si vous pouvez tout de même vous offrir la voiture sans les options, affichez le second message.
- Enfin, si vous ne pouvez pas vous offrir la voiture du tout, affichez le dernier message en indiquant combien d'euros il vous manque.