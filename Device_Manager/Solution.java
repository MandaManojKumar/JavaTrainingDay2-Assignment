package Device_Manager;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Create an array to hold Phone objects
        Phone[] phones = new Phone[4];

        // Read values for Phone objects
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int phoneId = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            String os = scanner.nextLine();
            String brand = scanner.nextLine();
            int price = scanner.nextInt();
            phones[i] = new Phone(phoneId, os, brand, price);
        }

        // Read the value for brand and os
        scanner.nextLine(); // Consume newline character
        String brand = scanner.nextLine();
        String os = scanner.nextLine();

        // Call the methods and display the result
        int priceForBrand = findPriceForGivenBrand(phones, brand);
        if (priceForBrand > 0) {
            System.out.println(priceForBrand);
        } else {
            System.out.println("The given Brand is not available");
        }

        Phone phoneBasedOnOs = getPhoneIdBasedOnOs(phones, os);
        if (phoneBasedOnOs != null) {
            System.out.println(phoneBasedOnOs.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }


        scanner.close();
    }

    public static int findPriceForGivenBrand(Phone[] phones, String brand) {
        int totalPrice = 0;
        for (Phone phone : phones) {
            if (phone.getBrand().equalsIgnoreCase(brand)) {
                totalPrice += phone.getPrice();
            }
        }
        return totalPrice;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os) {
        for (Phone phone : phones) {
            if (phone.getOs().equalsIgnoreCase(os) && phone.getPrice() >= 50000) {
                return phone;
            }
        }
        return null;
    }
}
