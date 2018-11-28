import java.util.ArrayList;

public class Game {

	public Game() {
		ArrayList <City> listCity = new ArrayList<City>();
		listCity.add(new City("Paris", true, 0));
		System.out.println(listCity.get(0).getDescription());
		
		
	}
	
}
