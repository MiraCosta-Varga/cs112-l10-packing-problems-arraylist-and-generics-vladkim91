public class Parts extends Supplies {

	// instance variables
	private int partNumber;

	// Default constructor
	public Parts() {
		super();
		this.setPartNumber(-1);
	}

	// Full constructor
	public Parts(String name, int quantity, int partNumber) {
		super(name, quantity);
		this.setPartNumber(partNumber);
	}

	// Set
	public void setPartNumber(int number) {
		this.partNumber = number;
	}

	// Get
	public int getPartNumber() {
		return partNumber;
	}

	// toString method
	public String toString() {
		return "PART: " + this.getName() + ", PN# " + this.partNumber + ", QTY: " + this.getQuantity();
	}
}