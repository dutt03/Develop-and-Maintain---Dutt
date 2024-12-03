import java.util.ArrayList;
import java.util.List;

public class PurchaseProcessor {

    public static void main(String[] args) {
        // Create sample items
        List<Item> items = new ArrayList<>();

        // Add items
        items.add(new Item("Laptop", "Gaming Laptop", 1200.50, 1));
        items.add(new Item("Mouse", "Wireless Mouse", 25.99, 2));
        items.add(new Item("Keyboard", "Mechanical Keyboard", 75.49, 1));

        // Calculate total cost
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getUnitPrice() * item.getItemQuantity();
        }

        // Display items and total cost
        for (Item item : items) {
            System.out.println("Item: " + item.getItemName() + ", Quantity: " + item.getItemQuantity() +
                               ", Subtotal: $" + (item.getUnitPrice() * item.getItemQuantity()));
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}
