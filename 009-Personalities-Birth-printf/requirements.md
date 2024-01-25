# Exercice 009 - Quand sont-ils nés ? : Formattage de chaînes

## Objectif
Nous allons reprendre l'exercice précédent en utilisant le formattage de chaîne pour combiner des chaînes et des variables en Java.

## Expression du besoin
Veuillez vous référer au sujet publié sur la plateforme de votre abonnement.

## Modèle
Si vous ne savez pas par où commencer :

```java
public class NaissanceFormat {
    public static void main(String[] args) {
        int annee;
        String prenom, nom, jour, mois;
    }
}
```

## Astuce
Utilisez le placeholder %d pour l'année et %s pour les autres variables.

Attention, contrairement à `println`, `printf` n'effectue pas de saut de ligne après affichage, il vous faudra donc ajouter le saut de ligne dans la chaîne de formattage grâce à un `\n`.

## Explications
Déclarez des variables pour le jour, le mois, l'année, le prénom et le nom. L'année doit être de type int, et le reste doit être de type String.

```java
int annee;
String prenom, nom, jour, mois;
```

Créez une chaîne de formattage qui correspond à la phrase à afficher, en n'oubliant pas le saut de ligne.

```java
String format = "%s %s est née le %s/%s/%d\n";
```

Attribuez les valeurs appropriées à ces variables pour chaque personne.

```java
prenom = "Maryline"; nom = "Monroe"; jour = "01"; mois = "06"; annee = 1926;
```

Affichez la phrase.

```java
System.out.printf(format,prenom,nom,jour,mois,annee);
```

Répétez les étapes 3 et 4 pour chaque personne célèbre.