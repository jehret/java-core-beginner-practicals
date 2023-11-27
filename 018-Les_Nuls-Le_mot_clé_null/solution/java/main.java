public class Main {
    
    public static void main(String[] args) {
        Nul chabat = new Nul();
        chabat.nom = "Alain Chabat";
         
        if(chabat.nom != null ) {
            System.out.println( chabat.nom + " est bien un membre des Nuls");
        } else {
            System.out.println( chabat.nom + " n'est pas un membre des Nuls");
        }
        
        Nul nouveauMembre = new Nul();
        
        if(nouveauMembre.nom != null ) {
            System.out.println( nouveauMembre.nom + " est bien un membre des Nuls");
        } else {
            System.out.println( nouveauMembre.nom + " n'est pas un membre des Nuls");
        } 
        

    }
}