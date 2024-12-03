public class Item {

	private String itemName;
	private String itemDescription;
	private double unitPrice;
	private int itemQuantity;

	// Constructor
	public Item(String itemName, String itemDescription, double unitPrice, int itemQuantity) {
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.unitPrice = unitPrice;
		this.itemQuantity = itemQuantity;
	}

	// Getters and Setters
	public String getItemName() {
		return itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}
}
