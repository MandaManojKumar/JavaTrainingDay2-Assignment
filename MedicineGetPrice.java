import java.util.*;

class Medicine {
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    // Parameterized constructor
    public Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    // Getters and setters
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class MedicineGetPrice {

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
