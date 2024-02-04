public class SecondesAu21emeSiecle {
    
    public static void main(String... args){
        TempsPasse tps=new TempsPasse();
        for (int annee=2000 ; annee<2018 ;annee++){
            tps.ajouteAnnee(annee);
        }
        for (int mois=1 ; mois<4 ;mois++){
            tps.ajouteMois(mois,false);
        }
        
        tps.ajouteHeures(14);
        tps.ajouteMinutes(28);
        tps.ajouteSecondes(32);
        
        System.out.println("Au 21ème siècle il y a eu "+tps.nombreDeSecondes+" secondes");
        
    }

}