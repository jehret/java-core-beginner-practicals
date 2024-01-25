public class Mario {
    static int nbVie = 5;
    int taille;
    boolean estInvincible;
    int nbPiece;

    public Mario() {
        this.taille = 1;
        this.estInvincible = false;
        this.nbPiece = 0;
    }
    
    void mangerChampignonVert(ChampignonVert cv){
        Mario.nbVie++;
        cv.estAttrape = true;
        System.out.println("Mario gagne 1 vie grâce à un champignon vert");
    }
    
    void mangerChampignonRouge(ChampignonRouge cr){
        this.taille++;
        cr.estAttrape = true;
        System.out.println("Mario devient grand grâce à un champignon rouge");
    }
    
    void attraperPiece(PieceDoree piece) {
        this.nbPiece++;
        System.out.println("Mario attrape une pièce");
        if(this.nbPiece == 100){
            Mario.nbVie++;
            this.nbPiece = 0;
            System.out.println("Mario gagne 1 vie grâce à 100 pièces");
        }
        piece.estAttrape = true;
        
   }
    
    void attraperEtoile(Etoile etoile) {
        this.estInvincible = true;
        etoile.estAttrape = true;
        System.out.println("Mario devient invincible grâce à une étoile");
    }
    
    
}