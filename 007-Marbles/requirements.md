# Exercice 007 - Louis joue aux billes : Les opérateurs d’incrémentation / décrémentation

## Objectif
Dans cet exercice, vous allez pouvoir utiliser les opérateurs d’incrémentation et de décrémentation en Java.

## Expression du besoin
Veuillez vous référer au sujet publié sur la plateforme de votre abonnement.

## Modèle
Si vous ne savez pas par où commencer :

    public class Billes {
        public static void main(String[] args) {
            
        }
    }

## Astuce
Pour résoudre cet exercice, vous devrez utiliser une seule variable entière pour garder une trace du nombre de billes que Louis possède.
Vous commencerez par initialiser cette variable à 10.
Ensuite, vous utiliserez l'opérateur de décrémentation (`--`) pour soustraire les 2 billes prises par Pierre et l'opérateur d'incrémentation (`++`) pour ajouter la bille que Louis récupère de Tom.
Enfin, vous imprimerez le nombre initial et le nombre final de billes en utilisant `System.out.println()`.

## Explications
Déclarer une variable de type entier, par exemple `billes`, et initialisez la à 10.
Affichez le nombre de billes en début de partie précédé du message qui convient.
Utilisez 2 fois l'opérateur de décrémentation `--` pour représenter le fait que Pierre prend 2 billes à Louis.
Utilisez 2 fois l'opérateur d'incrémentation `++` pour représenter le fait que Louis récupère une bille chez Tom.
Afficher ensuite le nombre de billes final précédé du message qui convient.