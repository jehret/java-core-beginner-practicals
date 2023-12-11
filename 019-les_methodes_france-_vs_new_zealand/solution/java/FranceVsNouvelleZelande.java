public class FranceVsNouvelleZelande {
    
    public static void main(String... args){
        Equipe france=new Equipe();
        france.nom="France";
        Equipe nz=new Equipe();
        nz.nom="Nouvelle-Zélande";   
        
        france.essai();
        france.transformation();
        nz.essai();
        nz.transformation();
        nz.essai();
        nz.transformation();
        france.essai();
        france.drop();
        france.drop();
        
        if (france.score>nz.score){
            System.out.println("L'équipe de "+france.nom+" bat l'équipe de "+nz.nom+" par "+france.score+" points à "+nz.score+".");
        }
        else if (france.score<nz.score){
            System.out.println("L'équipe de "+nz.nom+" bat l'équipe de "+france.nom+" par "+nz.score+" points à "+france.score+".");
        }
        else {
            System.out.println("L'équipe de "+nz.nom+" et l'équipe de "+france.nom+" font match nul "+nz.score+" points à "+france.score+".");
            
        }
        
    }

}