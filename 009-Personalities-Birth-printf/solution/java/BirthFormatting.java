public class BirthFormatting {

    public static void main(String[] args) {
        int year;
        String firstName, lastName, day, month;
        String format = "%s %s is born %s/%s/%d\n";
        firstName = "Maryline"; lastName = "Monroe"; day = "01"; month = "06"; year = 1926;
        System.out.printf(format,firstName,lastName,day,month,year);
        firstName = "Charlie"; lastName = "Chaplin"; day = "16"; month = "04"; year = 1889;
        System.out.printf(format,firstName,lastName,day,month,year);
        firstName = "Auguste"; lastName = "Renoir"; day = "25"; month = "02"; year = 1841;
        System.out.printf(format,firstName,lastName,day,month,year);
        firstName = "Winston"; lastName = "Churchill"; day = "30"; month = "11"; year = 1874;
        System.out.printf(format,firstName,lastName,day,month,year);
        firstName = "Albert"; lastName = "Einstein"; day = "14"; month = "03"; year = 1879;
        System.out.printf(format,firstName,lastName,day,month,year);
    }


}