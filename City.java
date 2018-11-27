import java.util.ArrayList;

public class City {
	
	private final String name;
	private final boolean hasAnAirport;
	private ArrayList <City> destination;
	private final ArrayList <String> destinationS;
	//private final ArrayList <Place> placeList;
	
	public City(String name, boolean hasAnAirport, ArrayList<String> destinationS) {
		this.name = name;
		this.hasAnAirport = hasAnAirport;
		this.destinationS = destinationS;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean hasAnAirport() {
		return this.hasAnAirport;
	}
	
	public ArrayList<City> getDestination() {
		return this.destination;
	}
	
	public String getDescription() {
		return this.name + " | airport : " + this.hasAnAirport + "\n" + "Destination : TO FINISH";
	}
	
	//Useless I think
	public City getCity() {
		return this;
	}
	
}
