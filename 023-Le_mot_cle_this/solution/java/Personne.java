public class Personne {
    
    String nom;
    Personne voisin;
    
    void sePresenter(){
        
        System.out.println("Bonjour je m'appelle "+nom+" ! Et toi comment t'appelles-tu ?");
        
        if (voisin!=null){
            voisin.sePresenter(this);
        }
        
    }
    
    void sePresenter(Personne autrePersonne){
        
        System.out.println("Bonjour "+autrePersonne.nom+" ! Je m'appelle "+nom+"."+(voisin!=null ? " Et toi comment t'appelles-tu ?" : ""));
        
        if (voisin!=null){
            voisin.sePresenter(this);
        }
        
    }
    
}