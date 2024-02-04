# Exercice 010 - Gains du Loto, Version 1 : Premières instructions conditionnelles

## Objectif
Utiliser `if` et `else` pour effectuer des variations dans le traitement du code. Cette compétence est essentielle pour pouvoir créer des applications dyamiques.

## Expression du besoin
Veuillez vous référer au sujet publié sur la plateforme de votre abonnement.

## Modèle
Si vous ne savez pas par où commencer :

```java
public class Loto {
    public static void main(String[] args) {
    int factureElectricite = 341;
    }
}
```

## Astuce
1. Variables: Commencez par déclarer les variables associées à chaque montant mentionné dans l'expression de besoin (gains au loto, prix de la voiture...).
2. Calcul: Calculez le montant total restant après dépenses. Stockez ce résultat dans une variable nommée `total`.
3. Conditions: Utilisez `if` pour vérifier si le total est positif ou négatif.
4. Sortie: Affichez le message approprié en fonction de la condition.

## Explications
1. Variables: We declare variables for each amount to keep track of them. This makes the code easier to read and modify later.

```java
int lotteryWinnings = 25000;
int loanRepayment = 5000;
int electricityBill = 341;
int carPrice = 18000;
int backupSensorPrice = 450;
int rimPrice = 900;
```

2. Calculation: We calculate the total amount left after all expenses and store it in a variable named total.

```java
int total=gainLoto-remboursementPret-factureElectricite-(prixVoiture+prixJantes+prixRadarRecul);
```

3. Condition: Nous utilisons if et else pour vérifier si le total est positif ou negatif.

```java
if (total >= 0) {
    //
}
else {
    //
}
```

4. Sortie: En fonction du résultat de la condition, le programme va afficher l'un des 2 messages, indiquant si la voiture peut être achetée ou non.