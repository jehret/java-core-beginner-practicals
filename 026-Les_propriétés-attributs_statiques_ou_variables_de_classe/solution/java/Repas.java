public class Repas {
    static int compteurCalories = 0;
    static int nbRepas = 0;
    
    String nom;
    int nbCaloriesGagnees;
    
    public void consommer(){
        Repas.compteurCalories += nbCaloriesGagnees;
        Repas.nbRepas ++;

    }
    
}