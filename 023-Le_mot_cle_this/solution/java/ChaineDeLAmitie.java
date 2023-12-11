public class ChaineDeLAmitie {
    
    public static void main(String... args){
        Personne rene=new Personne();
        rene.nom="René";
        Personne julien=new Personne();
        julien.nom="Julien";
        rene.voisin=julien;
        Personne lisa=new Personne();
        lisa.nom="Lisa";
        julien.voisin=lisa;
        Personne lola=new Personne();
        lola.nom="Lola";
        lisa.voisin=lola;
        Personne cyrille=new Personne();
        cyrille.nom="Cyrille";
        lola.voisin=cyrille;
        
        rene.sePresenter();
    }

}