public class TenantsAndApartments {

    public static void main(String[] args) {

        //Apartment
        int area = 100;
        int roomsNb = 3;
        int rent = 700;
        boolean equippedKitchen = false;
        boolean balcony = false;
        boolean parking = true;

        System.out.println((area > 80 && roomsNb > 2 || area > 70 && roomsNb > 1 && equippedKitchen && balcony && parking) && rent <= 700);

        //Tenant's application
        int monthlyNetSalary = 1000;
        boolean permanentContract = false;
        boolean guarantor = true;
        int guarantorSalary = 3000;

        System.out.println(monthlyNetSalary >= 1500 && permanentContract ||  monthlyNetSalary > 900 && guarantor && guarantorSalary >= 3000);
    }
}

