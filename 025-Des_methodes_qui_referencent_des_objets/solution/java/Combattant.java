public class Combattant {
    String type;
    int niveauDeVie;
    Arme arme;
    
    void saisirArme(Arme nouvelleArme){
        this.arme = nouvelleArme;
    }
    
    int attaquer(Combattant ennemi){
        if(this.arme != null){
            ennemi.niveauDeVie-= this.arme.degat;
        } else {
            System.out.println("Le combattant ne possède pas d'arme et ne peut pas attaquer");
        }
        
        if(ennemi.niveauDeVie <= 0) {
            System.out.println(this.type + " a vaincu le combattant " +ennemi.type);
        }
        return ennemi.niveauDeVie;
    }
    
    int soigner(Combattant allie){
        if(this.type.equals("SOIGNEUR")){
            allie.niveauDeVie += 10;
        }
        return allie.niveauDeVie;
    }
    
}