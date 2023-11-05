# Practical 006 - Tenants and Apartments - Logical Operators

## Goal
In this exercise you'll be able to apply logical operators in Java to solve real-world problems.

## Requirements
Please refer to the requirements on the platform you subscribed to.

## Template
If you don't know where to start:

    public class TenantsAndApartments {

        public static void main(String[] args) {

            //Apartment
            int area = 100;
            int roomsNb = 3;
            int rent = 700;
            boolean equippedKitchen = false;
            boolean balcony = false;
            boolean parking = true;

            //Tenant's application
            int monthlyNetSalary = 1000;
            boolean permanentContract = false;
            boolean guarantor = true;
            int guarantorSalary = 3000;

        }
    }

## Tip
To solve this exercise, you'll need to use conditional statements (if-else) to evaluate multiple criteria for both the apartment and the tenant.
Use logical operators like `&&` (AND) and `||` (OR) to combine conditions.
For example, to check if the apartment meets the first set of criteria, you could use a condition like (`area > 80 && roomsNb > 2 && rent <= 700`). 
Similarly, create conditions for the tenant's application.

