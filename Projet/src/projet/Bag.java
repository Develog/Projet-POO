package projet;
import java.util.ArrayList;

public class Bag {
	
	private final ArrayList <Item> bagItem;
	private final ArrayList <Parchment> bagParchment;
	private final static int NBR_TOTAL_PARCHMENT = 5; 
	
	public Bag() {
		this.bagItem = new ArrayList<Item>();
		this.bagParchment = new ArrayList<Parchment>();
	}
	
	public void addItem(Item item) {
		this.bagItem.add(item);
	}
	
	public void removeItem(Item item) {
		this.bagItem.remove(item);
	}
	
	public void addParchment(Parchment parchment) {
		this.bagParchment.add(parchment);
	}
	
	public boolean hasAllParchment() {
		if(this.bagParchment.size() == Bag.NBR_TOTAL_PARCHMENT) {
			return true;
		} 
		else {
			return false;
		}
	}
}
