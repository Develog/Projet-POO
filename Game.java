import java.util.ArrayList;

public class Game {

	public Game() {
		ArrayList <City> listCity = new ArrayList<City>();
		listCity.add(new City("Paris", true, 0));
		listCity.add(new City("Marseille", true, 1));
		listCity.add(new City("Lyon", true, 2));
		listCity.add(new City("Bordeaux", true, 3));
		listCity.add(new City("Lille", false, 4));
		listCity.add(new City("Le Havre", false, 5));
		listCity.add(new City("Rennes", false, 6));
		listCity.add(new City("Strasbourg", false, 7));
		listCity.add(new City("La Rochelle", false, 8));
		listCity.add(new City("Nantes", false, 9));
		listCity.add(new City("Toulouse", false, 10));
		listCity.add(new City("Montpellier", false, 11));
		listCity.add(new City("Nice", false, 12));
		listCity.add(new City("Brest", false, 13));
		listCity.add(new City("Dijon", false, 14));
		listCity.add(new City("Poitiers", false, 15));
		listCity.add(new City("Reims", false, 16));
		
		System.out.println(listCity.get(3).getDescription());
	}
	
}
