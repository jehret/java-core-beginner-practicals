public class Regime {


    public static void main(String[] args) {
        Repas repasMatin = new Repas();
        repasMatin.nom = "Pain + Beurre + Confiture + Yaourt aux fruits + Jus de fruit";
        repasMatin.nbCaloriesGagnees = 642;
        repasMatin.consommer();
        
        Repas repasMidi = new Repas();
        repasMidi.nom = "Cheesburger + Frites + Mayonnaise + Bière ";
        repasMidi.nbCaloriesGagnees = 1275;
        repasMidi.consommer();
        
        Activite activiteSportive = new Activite();
        activiteSportive.nom = "Entraînement de basket-ball";
        activiteSportive.nbCaloriesPerdues = 550;
        activiteSportive.effectuer();
        
        
        Repas repasSoir = new Repas();
        repasSoir.nom = "Salade de pâte + Eau + Comté";
        repasSoir.nbCaloriesGagnees = 547;
        repasSoir.consommer();

        System.out.println("Après " + Repas.nbRepas + " repas et "+ Activite.nbActivite + " activités mon apport calorique du jours est de " + Repas.compteurCalories + " calories");

        if(Repas.compteurCalories < 2000) {
            System.out.println("Je suis bien en dessous de 2000 calories");
        } else {
            System.out.println("J'ai un peu trop mangé ajourd'hui");
        }
    
    }

}