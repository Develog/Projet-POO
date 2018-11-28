
public class ItemTicket extends Item {

	private final String name;
	private final int quantity;
	
	public ItemTicket(String name, int quantity) {
		super(name, quantity);
		this.name = name;
		this.quantity = quantity;
	}

	public String getDescription() {
		return this.name + " : " + this.quantity;
	}
}
