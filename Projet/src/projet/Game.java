package projet;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	private ArrayList <City> listCity;
	private Hero hero;
	private String beginningText = "";
	
	public Game() {
		//Create ArrayList of City
		this.createCity();
		
		//Starting dialogue
		this.startGame();
		
		System.out.println(this.hero.getActualCity().getDescription());
	}
	
	public void startGame() {
		try {
			File f = new File("src/Resources/BeginningConversation.txt");
			Scanner scanner = new Scanner(f);
			Scanner scannerIN = new Scanner(System.in);
			
			try {
				for(int i = 0; i < 4; i++) {
					this.beginningText += scanner.nextLine() + "\n";
				}
				System.out.println(this.beginningText);
				
				//Initialization of the HERO
				hero = new Hero(scannerIN.nextLine());
				
				this.beginningText = "";
				
				for(int i = 0; i < 4; i++) {
					this.beginningText += scanner.nextLine() + "\n";
				}				
			}
			catch (Exception e) {
				System.out.println(e);
				scanner.close();
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		this.beginningText = this.beginningText.replace("<NAME>", this.hero.getName());
		this.beginningText = this.beginningText.replace("<CITYNAME>", this.getDepartureCity().getName());
		System.out.println(this.beginningText);
	}
	
	public void createCity() {
		listCity = new ArrayList<City>();
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
	}
	
	public City getDepartureCity() {
		double randIndex;
		randIndex = Math.random() * this.listCity.size();
		this.hero.setActualCity(this.listCity.get((int) randIndex));
		this.hero.setPlace("City-Hall");
		return this.listCity.get((int) randIndex);
	}
}
