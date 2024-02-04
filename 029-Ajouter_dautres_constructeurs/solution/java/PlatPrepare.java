public class PlatPrepare {
    double prixTTC;
    
    PlatPrepare(){
        this.prixTTC = 0;
    }
    PlatPrepare(double prixHT){
        this.prixTTC = prixHT*1.1;
        Epicerie.chiffreAffaires+= this.prixTTC;
    }
    PlatPrepare(double prixHT, double reductionPourcent){
        double reduction = 1 - (reductionPourcent/100);
        this.prixTTC = prixHT*1.1*reduction;
        Epicerie.chiffreAffaires+= this.prixTTC;
    }
    
}