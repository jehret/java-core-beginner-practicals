# Exercice 012 - Hexadécimal : La structure conditionnelle switch - case

## Objectif
Nous allons reprendre l'exercice précédent en utilisant le formattage de chaîne pour combiner des chaînes et des variables en Java.
L'objectif de cet exercice est de comprendre et mettre en oeuvre la structure conditionnelle switch-case en Java. En exemple pratique, nous allons l'utiliser pour convertir des valeurs hexadecimales.

## Expression du besoin
Veuillez vous référer au sujet publié sur la plateforme de votre abonnement.

## Modèle
Si vous ne savez pas par où commencer :

```java
public class Hexadecimal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        char valeurHexadecimale = 'C';
        switch (valeurHexadecimale) {
            case '0':
            ...
            
        }
    }

}
```

## Astuce
1. Utilisez le switch-case pour gérer chaque valeur héxadecimale possible ('0' à '9' et 'A' à 'F').
2. Pour les caractères '0' à '9', retournez simplement la valeur correspondante au charactère d'origine.
3. Pour les caractères 'A' à 'F', retournez leur valeur décimale correspondante.
4. Utilisez le cas `default` pour gérer les caractères invalides et affichez un message d'erreur.

## Explications
Besoin d'un coup de main
? Visionnez les cours théoriques relatifs à cet exercice en utilisant
les liens ci-dessous (Vous bénéficierez d'un tarif préférentiel si vous
n'êtes pas déjà inscrit) :

- [La structure conditionnelle switch - case](https://www.udemy.com/cours-complet-de-programmation-java-pour-debutants/learn/v4/t/lecture/5991160/?couponCode=FROM_TP_JAVA)
1. Le switch-case est utilisé pour évaluer le caractère donné (en l'occurence la lettre 'C').
2. Les cas '0' à '9' vont simplement être retournés tels quels, car leur valeur décimale et héxadécimale est la même.
   Vous pouvez comme le suggère la solution vous contentez d'une instruction pour le cas '9', pour peu qu'il n'y ait pas de `break` pour interrompre les cas précédents.
3. Les cas 'A' à 'F' retourneront la valeur décimale correspondante (A=10, B=11, etc...).
4. `default` se chargera du cas d'erreur où l'on fournirait malencontreusement un caractère invalide, en affichant un message d'erreur dans la console.
5. Lorsque le `switch` est appliqué au caractère 'C', la valeur retournée est 12, puisque 'C' en héxadecimal équivaut 12 en décimal.
