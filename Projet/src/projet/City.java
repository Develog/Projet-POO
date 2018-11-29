package projet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class City {
	
	private final String name;
	private final boolean hasAnAirport;
	private ArrayList <String> destination;
	private ArrayList <String> readDestination;
	private final ArrayList <Place> placeList;
	
	private String cityName;
	private String cityDestination1, cityDestination2, cityDestination3;
	private String destinationString;
	
	public City(String name, boolean hasAnAirport, int idIndex) {
		this.name = name;
		this.hasAnAirport = hasAnAirport;
		this.destination = this.readDestination(idIndex);
		placeList = new ArrayList<Place>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean hasAnAirport() {
		return this.hasAnAirport;
	}
	
	public ArrayList<String> getDestination() {
		return this.destination;
	}
	
	public String getDescription() {
		for(String e : destination) {
			this.destinationString += " | " + e;
		}
		if(this.hasAnAirport) {
			return "You are in " + this.name + " !" + "\n" + "There is an airport and a train station in this city \n" + "You can go to : " + this.destinationString;
		}
		else {
			return "You are in " + this.name + " !" + "\n" + "There is no airport but a train station in this city \n" + "You can go to : " + this.destinationString;
		}
		
	}
	
	public City getCity() {
		return this;
	}
	
	public Place getPlace(String placeName) {
		for(Place place : this.placeList) {
			if(place.getPlaceName() == placeName)
			{
				return place;
			}
		}
		return placeList.get(0);
	}
	
	public void createPlace() {
		placeList.add(new Place("City-Hall", null));
		placeList.add(new Place("Park", null));
		placeList.add(new Place("Mall", null));
		placeList.add(new Place("Museum", null));
		placeList.add(new Place("Train-station", null));
		placeList.add(new Place("Airport", null));
		placeList.add(new Place("Parking", null));
	}
	
	public ArrayList<String> readDestination(int idIndex) {
		
		readDestination = new ArrayList<String>();
		
		try {
			File f = new File("src/Resources/CityDestination.txt");
			Scanner scanner = new Scanner(f);
			
			try {
				for(int i = 0; i < idIndex; i++) {
					scanner.nextLine();
				}
				
				this.cityName = scanner.next();
				//3 Cities
				if(this.cityName.equals("Paris")) {
					this.cityDestination1 = scanner.next();
					this.cityDestination2 = scanner.next();
					this.cityDestination3 = scanner.next();
				}
				//1 City
				else if(this.cityName.equals("Nice") || this.cityName.equals("Brest")) {
					this.cityDestination1 = scanner.next();
					this.cityDestination2 = "";
					this.cityDestination3 = "";
				}
				//2 Cities
				else
				{
					this.cityDestination1 = scanner.next();
					this.cityDestination2 = scanner.next();
					this.cityDestination3 = "";
				}
				this.readDestination.add(this.cityDestination1);
				this.readDestination.add(this.cityDestination2);
				this.readDestination.add(this.cityDestination3);
				
				scanner.close();
				}
				catch(NoSuchElementException e) {
					
				}			
		}
		catch (FileNotFoundException e) {
			System.out.println("Fichier introuvable");
		}		 
	return this.readDestination;
	}
}
