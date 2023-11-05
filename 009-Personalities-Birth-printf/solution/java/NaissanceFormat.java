public class NaissanceFormat {

    public static void main(String[] args) {
        int annee;
        String prenom, nom, jour, mois;
        String format = "%s %s est née le %s/%s/%d\n";
        prenom = "Maryline";nom = "Monroe";jour = "01";mois = "06";annee = 1926;
        System.out.printf(format,prenom,nom,jour,mois,annee);
        prenom = "Charlie";nom = "Chaplin";jour = "16";mois = "04";annee = 1889;
        System.out.printf(format,prenom,nom,jour,mois,annee);
        prenom = "Auguste";nom = "Renoir";jour = "25";mois = "02";annee = 1841;
        System.out.printf(format,prenom,nom,jour,mois,annee);
        prenom = "Winston";nom = "Churchill";jour = "30";mois = "11";annee = 1874;
        System.out.printf(format,prenom,nom,jour,mois,annee);
        prenom = "Albert";nom = "Einstein";jour = "14";mois = "03";annee = 1879;
        System.out.printf(format,prenom,nom,jour,mois,annee);
    }

}