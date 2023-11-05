public class LocatairesEtAppartements {

    public static void main(String[] args) {

        //Appartement
        int surface = 100;
        int nbPiece = 3;
        int loyer = 700;
        boolean cuisineEquipe = false;
        boolean balcon = false;
        boolean parking = true;

        System.out.println((surface > 80 && nbPiece > 2 && loyer <=700 || surface > 70 && nbPiece > 1 && cuisineEquipe && balcon && parking ) && loyer <= 700);


        //Dossier locataire
        int salaireMensuelNet = 1000;
        boolean cdi = false;
        boolean garant = true;
        int salaireGarant = 3000;

        System.out.println(salaireMensuelNet >= 1500 && cdi || salaireMensuelNet >= 900 && garant && salaireGarant >= 3000);

    }
}