public class Loto {
    public static void main(String[] args) {
        int gainLoto = 25000;
        int remboursementPret=5000;
        int factureElectricite= 341;
        int prixVoiture = 18000;
        int prixRadarRecul = 450;
        int prixJantes = 900;
        int total=gainLoto-remboursementPret-factureElectricite-(prixVoiture+prixJantes+prixRadarRecul);
        if (total >= 0) {
            System.out.println("Oui, je peux acheter ma voiture et il me restera "+total+" euros !");
        } else {
            System.out.println("Je ne peux pas acheter la voiture. Il me manque "+(-total)+" euros.");
        }

    }
}
