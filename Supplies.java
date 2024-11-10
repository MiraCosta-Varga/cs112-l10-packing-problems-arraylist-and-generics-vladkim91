public class Supplies {

	// Instance variables
	private String name;
	private int quantity;

	// Default constructor
	public Supplies() {
		this.name = "Thing";
		this.quantity = 0;
	}

	// Full constructor
	public Supplies(String name, int quantity) {
		this.setName(name);
		this.setQuantity(quantity);
	}

	// Getters and setters
	public void setName(String name) {
		this.name = name;
	}

	public void setQuantity(int qty) {
		this.quantity = qty;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	// toString method
	public String toString() {
		return "SUPPLIES: " + this.name + ", QTY: " + quantity;
	}
}