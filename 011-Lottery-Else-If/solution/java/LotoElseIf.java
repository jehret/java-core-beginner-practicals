public class LotoElseIf {
    public static void main(String[] args) {
        int gainLoto = 25000;
        int remboursementPret=5000;
        int factureElectricite= 341;
        int impots = 448;
        int billetTrouve = 50;

        int prixVoiture = 18000;
        int prixRadarRecul = 450;
        int prixJantes = 900;
        int voitureOptions = prixVoiture+prixJantes+prixRadarRecul;

        int argentDispo = gainLoto-remboursementPret-factureElectricite-impots+billetTrouve;

        if (argentDispo >= voitureOptions) {
            System.out.println("Oui, je peux acheter ma voiture et il me restera "+(argentDispo - voitureOptions)+" euros !");
        } else if (argentDispo >= prixVoiture) {
            System.out.println("Je peux acheter la voiture mais il me manque " + (voitureOptions - argentDispo) + " euros pour les options !");
        } else {
            System.out.println("Je ne peux pas acheter la voiture. Il me manque "+(prixVoiture - argentDispo)+" euros.");
        }
    }
}