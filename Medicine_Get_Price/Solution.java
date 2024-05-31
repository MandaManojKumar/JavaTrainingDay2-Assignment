package Medicine_Get_Price;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Read values for Medicine objects and disease
        Scanner scanner = new Scanner(System.in);
        Medicine[] medicines = new Medicine[4];
        for (int i = 0; i < 4; i++) {
            String medicineName = scanner.next();
            String batch = scanner.next();
            String disease = scanner.next();
            int price = scanner.nextInt();
            medicines[i] = new Medicine(medicineName, batch, disease, price);
        }
        String disease = scanner.next();

        // Call the getPriceByDisease method
        List<Integer> prices = getPriceByDisease(medicines, disease);

        // Print the result
        for (Integer price : prices) {
            System.out.println(price);
        }


        scanner.close();
    }

    public static List<Integer> getPriceByDisease(Medicine[] medicines, String disease) {
        List<Integer> prices = new ArrayList<>();
        for (Medicine medicine : medicines) {
            if (medicine.getDisease().equalsIgnoreCase(disease)) {
                prices.add(medicine.getPrice());
            }
        }
        Collections.sort(prices);
        return prices;
    }
}
