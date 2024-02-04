public class Main {

    public static void main(String[] args) {
        
        Mario mario = new Mario();
        
        ChampignonVert cv = new ChampignonVert();
        ChampignonRouge cr = new ChampignonRouge();
        Etoile etoile = new Etoile();
        PieceDoree piece = new PieceDoree();
        PieceDoree piece1 = new PieceDoree();
        PieceDoree piece2 = new PieceDoree();
        PieceDoree piece3 = new PieceDoree();
        PieceDoree piece4  = new PieceDoree();
        
        mario.mangerChampignonRouge(cr);
        mario.attraperPiece(piece);
        mario.attraperPiece(piece1);
        mario.attraperPiece(piece2);
        mario.attraperPiece(piece3);
        mario.attraperPiece(piece4);
        mario.mangerChampignonVert(cv);
        mario.attraperEtoile(etoile);

    }
    
}
