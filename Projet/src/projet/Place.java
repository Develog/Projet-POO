package projet;
public class Place {
	
	private final String name;
	private final boolean hasNPC;
	private final boolean hasMoney;
	private final boolean hasParchment;
	
	public Place(String name, NPC npc) {
		this.name = name;
		if(npc != null) {
			this.hasNPC = true;
		}
		else {
			this.hasNPC = false;
		}
		//Here function to randomise if there are Money nor parchment on the place
		this.hasMoney = false;
		this.hasParchment = false;
	}
	
	public String getPlaceName() {
		return this.name;
	}
	
	//Useless
	public Place getPlace() {
		return this;
	}
	
	public String getDescription() {
		return this.name;
	}
	
	public boolean hasObject() {
		if(this.hasMoney || this.hasParchment) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean hasNPC() {
		return this.hasNPC;
	}
}
