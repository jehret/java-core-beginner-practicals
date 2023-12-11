public class Activite {
    
    static int nbActivite = 0;
    
    String nom;
    int nbCaloriesPerdues;
    
    public void effectuer(){
        Repas.compteurCalories -= nbCaloriesPerdues;
        Activite.nbActivite++;
    }
    
}