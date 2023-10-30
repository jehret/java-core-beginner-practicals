# Exercice 003 - Question pour un champion : Première variable de type String

## Objectif
A la fin de cet exercice, vous serez capable d'identifier, déclarer, et initialiser une variable de type String en Java.

## Expression du besoin
Vous connaissez tous ce jeu télé qui aura 30 ans en 2018. Le principe est grosso-modo assez simple, l’animateur pose une question et il faut donner la réponse.
Et bien c’est à votre tour de jouer !
Vous trouverez ci-dessous un code incomplet qui contient uniquement des questions, une série de 5 questions pour être précis.
Vous devez utiliser une variable de type `String` que vous nommerez reponse pour stocker successivement la réponse à chaque question, réponse que vous afficherez avec un `System.out.println`

La plateforme évaluera non seulement que votre code est correct, mais vous donnera également votre résultat alors bonne chance !

## Modèle
Si vous ne savez pas par où commencer :

    public class QuestionPourUnChampion {

        public static void main(String[] args) {
            System.out.println("Quel était le métier de Roland Garros ?");
            System.out.println("Comment se nommaient les missions américaine qui ont mené le 1er homme sur la lune ?");
            System.out.println("A quoi correspond le symbole chimique N ?");
            System.out.println("Qui a écrit le Rouge et le Noir ?");
            System.out.println("Quelle pays trouve t-on entre l'Italie et le Liechtenshtein ?");
        }
    }

## Astuce
Vous pouvez nommer la variable `answer` par exemple.
Utilisez la variable pour stocker successivement chaque réponse à chaque question. 
Après quoi vous pourrez successivement afficher la réponse dans la console avec un `System.out.println(answer);`.