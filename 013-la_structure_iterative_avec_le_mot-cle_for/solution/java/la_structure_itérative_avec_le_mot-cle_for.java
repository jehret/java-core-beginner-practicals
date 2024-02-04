public class Punition {
    public static void main(String[] args) {
        String ligne = "Je n'ai pas le droit d'aller sur Udemy en classe.";
        for (int i = 1; i <= 25; i++) {
                if (i % 5 == 0) {
                    System.out.println(i + " - " + ligne);
                } else {
                    System.out.println(ligne);
                }
        }
    }
}