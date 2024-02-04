public class ProduitAlimentaire {
    double prixTTC;
    
    ProduitAlimentaire(){
        this.prixTTC = 0;
    }
    ProduitAlimentaire(double prixHT){
        this.prixTTC = prixHT*1.055;
        Epicerie.chiffreAffaires+= this.prixTTC;
    }
    ProduitAlimentaire(double prixHT, double reductionPourcent){
        double reduction = 1 - (reductionPourcent/100);
        this.prixTTC = prixHT*1.055* reduction;
        Epicerie.chiffreAffaires+= this.prixTTC;
    }
    
}