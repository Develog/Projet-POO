package projet;

public class Item {
	private final String name;
	private final int quantity;
	private boolean isActive;
	
	public Item(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
		this.isActive = true;
	}
	
	public String getDescription() {
		return "Ceci est l'item : " + this.name;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void isActive(boolean active) {
		this.isActive = active;
	}
	public boolean isActive() {
		return this.isActive;
	}
}
