
public class ItemMoney extends Item {
	
	private final String name;
	private final int quantity;
	
	public ItemMoney(String name, int quantity) {
		super(name, quantity);
		this.quantity = quantity;
		this.name = name;
	}
	
	public String getDescription() {
		return this.name + " : " + this.quantity;
	}
	
}
