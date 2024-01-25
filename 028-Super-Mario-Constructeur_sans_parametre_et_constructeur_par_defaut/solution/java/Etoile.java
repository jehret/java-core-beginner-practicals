public class Etoile {
    static int nbEtoile;
    boolean estAttrape;

    public Etoile() {
        this.estAttrape = false;
        if(Etoile.nbEtoile < 2){
            Etoile.nbEtoile++;
        } else {
             System.out.println("Il y a trop d'étoiles sur ce niveau");
        }
        
    }

}