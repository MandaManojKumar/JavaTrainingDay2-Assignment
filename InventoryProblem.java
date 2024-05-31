import java.util.*;

class Inventory {
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    // Parameterized constructor
    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    // Getters and setters
    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}

public class InventoryProblem {

    public static void main(String[] args) {
        // Read values for Inventory objects and limit
        Scanner scanner = new Scanner(System.in);
        Inventory[] inventories = new Inventory[4];
        for (int i = 0; i < 4; i++) {
            String inventoryId = scanner.next();
            int maximumQuantity = scanner.nextInt();
            int currentQuantity = scanner.nextInt();
            int threshold = scanner.nextInt();
            inventories[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
        }
        int limit = scanner.nextInt();

        // Call the replenish method
        Inventory[] replenishedInventories = replenish(inventories, limit);

        // Print the result
        for (Inventory inventory : replenishedInventories) {
            if (inventory.getThreshold() > 75) {
                System.out.println(inventory.getInventoryId() + " Critical Filling");
            } else if (inventory.getThreshold() >= 50 && inventory.getThreshold() <= 75) {
                System.out.println(inventory.getInventoryId() + " Moderate Filling");
            } else {
                System.out.println(inventory.getInventoryId() + " Non-Critical Filling");
            }
        }

        scanner.close();
    }

    public static Inventory[] replenish(Inventory[] inventories, int limit) {
        List<Inventory> replenishedList = new ArrayList<>();
        for (Inventory inventory : inventories) {
            if (inventory.getThreshold() <= limit) {
                replenishedList.add(inventory);
            }
        }
        return replenishedList.toArray(new Inventory[0]);
    }
}
