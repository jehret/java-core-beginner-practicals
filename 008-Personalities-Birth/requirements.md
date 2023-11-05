# Exercice 008 - Quand sont-ils nés ? : Opérateur de concaténation

## Objectif
Dans cet exercice, vous expérimenterez l'utilisation de l'opérateur de concaténation pour combiner des chaînes de caractères et des variables en Java.

## Expression du besoin
Veuillez vous référer au sujet publié sur la plateforme de votre abonnement.

## Modèle
Si vous ne savez pas par où commencer :

    public class Naissance {
        public static void main(String[] args) {
            int annee;
            String prenom, nom, jour, mois;
        }
    }

## Astuce
Pour résoudre cet exercice, vous devrez utiliser la concaténation de chaînes de caractères et des variables.
Déclarez des variables pour le jour, le mois, l'année, le prénom et le nom de famille de chaque personne célèbre.
Utilisez l'opérateur `+` pour concaténer ces variables en une phrase complète décrivant la date de naissance de chaque personne.
Veillez à utiliser un type `int` pour l'année et des types `String` pour les autres variables.

## Explications

Déclarez des variables pour le jour, le mois, l'année, le prénom et le nom. L'année doit être de type int, et le reste doit être de type String.
    
    int annee;
    String prenom, nom, jour, mois;

Attribuez les valeurs appropriées à ces variables pour chaque personne.

    prenom = "Maryline" ; nom = "Monroe" ; jour = "01" ; mois = "06" ; annee = 1926 ;


Utilisez la concaténation de chaînes pour former la phrase.

    System.out.println(prenom + " " + nom + " est né le " + jour + "/" + mois + "/" + annee) ;

Répétez les étapes 2 et 3 pour chaque personne célèbre.