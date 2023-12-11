# Exercice 020 - Combien de secondes se sont écoulées au 21ème siècle : Arguments et valeur de retour d'une méthode

## Objectif
Nous allons reprendre l'exercice précédent en utilisant le formattage de chaîne pour combiner des chaînes et des variables en Java.

## Expression du besoin
Veuillez vous référer au sujet publié sur la plateforme de votre abonnement.

## Modèle
Si vous ne savez pas par où commencer :

```java
public class Fomo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
    
}
```

## Explications
Quand j'étais petit, si quelqu'un voulait nous contacter il n'avait que ces 2 options : le courrier ou le téléphone fixe.

Puis, est arrivé le minitel, le téléphone portable et enfin l'internet qui a littéralement décuplé les moyens de contacter quelqu'un :

email, facebook messenger, skype et les réseaux sociaux en général, le téléphone sur internet avec skype, whatsapp, viber ou équivalent.

Bref...lorsque quelqu'un vous dit qu'il va vous recontacter sans vous dire comment, c'est la panique ! C'est aussi beaucoup de temps perdu à vérifier quasi quotidiennement si quelqu'un n'aurait pas essayé de nous contacter via tous ces canaux, nous sommes tous atteints du syndrome fomo (Fear of missing out)...

Nous allons créer la classe Message  qui représente une communication effectuée selon le moyen de son choix.

Cette classe dispose de la méthode contactVoix()  qui prend en paramètre le numéro de téléphone sous forme de chaine de caractères.

Cette méthode sera surchargée par la méthode de même nom qui prendra en paramètre le type de moyen de communication sous forme de chaîne de caractères ("skype", "whatsapp", "viber"...) et l'identifiant utiliser pour indiquer le destinataire sous forme de chaine de caractères également.

La classe disposera également d'une méthode contactTexte()  qui prendra en paramètre l'adresse email sous forme de chaine de caractères.

Cette méthode sera surchargée par la méthode de même nom qui prendra en paramètre le type de moyen de communication sous forme de chaîne de caractères ("facebook", "skype"...) et l'identifiant utiliser pour indiquer le destinataire sous forme de chaine de caractères également.

Chacune des 4 méthodes retournera la chaine de caractères "Tentative de contact voix / texte avec X en utilisant Y". Par exemple : Tentative de contact texte avec lucien@worldcompany.com par email

Il faudra également éviter de répéter du code inutile, aussi, les méthodes qui ne disposent que d'un seul argument devront utiliser les résultats retournés par les méthodes de même nom qui exploitent 2 arguments.

Contactez-moi par téléphone, mon numéro est 0064223664715, appelez-moi sur skype, mon identifiant est jpejnesis et laissez-moi un message sur skype également et affichez à chaque fois dans la méthode main  ce qui est retourné par la méthode.

Visionnez les cours théoriques relatifs à cet exercice en utilisant 
les liens ci-dessous (Vous bénéficierez d'un tarif préférentiel si vous 
n'êtes pas déjà inscrit) :

- [Arguments et valeur de retour d'une méthode](https://www.udemy.com/cours-complet-de-programmation-java-pour-debutants/learn/v4/t/lecture/5991160/?couponCode=FROM_TP_JAVA)