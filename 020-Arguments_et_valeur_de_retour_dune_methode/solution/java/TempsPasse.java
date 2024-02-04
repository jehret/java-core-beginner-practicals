public class TempsPasse {
    int nombreDeSecondes;
    
    void ajouteSecondes(int secondes){
        nombreDeSecondes+=secondes;
    }
    
    void ajouteMinutes(int minutes){
        ajouteSecondes(minutes*60);
    }
    
    void ajouteHeures(int heures){
        ajouteMinutes(heures*60);
    }
    
    void ajouteJours(int jours){
        ajouteHeures(jours*24);
    }
    
    void ajouteMois(int mois, boolean bissextile){
        switch (mois) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                ajouteJours(31);
                break;
            case 2 :
                ajouteJours(bissextile ? 29 : 28);
                break;
            default :
                ajouteJours(30);
        }
    }
    
    void ajouteAnnee(int annee){
        if (annee==2000 || annee==2004 || annee==2008 || annee==2012 || annee==2016){
            ajouteJours(366);
        }
        else {
            ajouteJours(365);
        }
    }
}