# Exercice 002 - Ecrire à la verticale : Première variable

## Objectif
A la fin de cet exercice, vous serez capable de déclarer et initialiser une variable.

## Expression du besoin
Il s’agit d’écrire à l’écran votre prénom à la verticale, c’est à dire une lettre par ligne comme ci-dessous :

J
e
a
n
n
e

Une variable se chargera d’accueillir successivement chacune des lettres.
C’est bien évidemment le contenu de cette variable qu’il faudra afficher sur chaque ligne.

## Modèle
Si vous ne savez pas par où commencer :

    public class Vertical {
        public static void main(String[] args) {
            lettre='';
        }
    }

## Astuce
Pour écrire à la verticale, considérez l'utilisation d'une boucle.
A chaque itération, vous pouvez extraire la lettre suivante de votre nom et la placer dans une variable. Comme une variable peut changer de valeur, vous n'avez besoin dans cet exercice que d'une seule variable. 