public class Main {

    public static void main(String[] args) {
        Epicerie monEpicierie = new Epicerie("Epicerie participative");
        
        PlatPrepare saladeChinoa = new PlatPrepare(12);
        PlatPrepare sandwichJambon = new PlatPrepare(6);
        PlatPrepare lasagnes = new PlatPrepare(15);
        PlatPrepare frites = new PlatPrepare(); //Cadeaux client
        
        ProduitAlimentaire pâtes = new ProduitAlimentaire(2);
        ProduitAlimentaire vinBioAvecReduction = new ProduitAlimentaire(20,15); //Vente avec réduction de 15%
        ProduitAlimentaire tomates = new ProduitAlimentaire(3);
        ProduitAlimentaire huileCoco = new ProduitAlimentaire(25);
        ProduitAlimentaire paquetBiscuit = new ProduitAlimentaire(5);
        ProduitAlimentaire amandes = new ProduitAlimentaire(30);
        
        if(Epicerie.chiffreAffaires > 100){
            System.out.println("Le chiffre d'affaires est de:" + Epicerie.chiffreAffaires + "€");
        } else {
            System.out.println("Le CA n'est pas assez élevé pour que l'épicerie soit rentable");
        }
        
    }
    
}