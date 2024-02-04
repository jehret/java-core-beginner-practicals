public class BatailleTerreDuMilieu {

    public static void main(String[] args) {

        Combattant humain = new Combattant();
        humain.niveauDeVie = 50;
        humain.type = "HUMAIN";
        
        Combattant orc = new Combattant();
        orc.niveauDeVie = 40;
        orc.type = "ORC";
        
        Combattant soigneurHumain = new Combattant();
        soigneurHumain.niveauDeVie = 20;
        soigneurHumain.type = "SOIGNEUR";
        
        Arme epee = new Arme();
        epee.type = "EPEE";
        epee.degat = 10;
        
        Arme hache = new Arme();
        hache.type = "HACHE";
        hache.degat = 20;
        
        humain.saisirArme(epee);
        orc.saisirArme(hache);
        
        humain.attaquer(orc);
        orc.attaquer(humain);
        soigneurHumain.soigner(humain);
        humain.attaquer(orc);
        humain.attaquer(orc);
        orc.attaquer(humain);
        humain.attaquer(orc);
        
    }
    
}