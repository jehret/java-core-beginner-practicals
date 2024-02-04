public class ChampignonVert {
    static int nbChampignonVert;
    String couleur;
    boolean estAttrape;

    public ChampignonVert() {
        this.couleur = "Vert";
        this.estAttrape = false;
        if(ChampignonVert.nbChampignonVert < 1) {
            