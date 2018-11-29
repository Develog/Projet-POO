package projet;
import java.util.ArrayList;

public class Hero {

	private final String name;
	private int money;
	private final static int MoneyDEF = 100;
	private ArrayList <City> alreadyVisitCity;
	private City actualCity;
	private Place actualPlace;
	private Bag bag;
	
	public Hero(String name) {
		this.name = name;
		this.money = Hero.MoneyDEF;
		bag = new Bag();
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Place getActualPlace() {
		return this.actualPlace;
	}
	
	public void setPlace(Place actualPlace) {
		this.actualPlace = actualPlace;
	}
	
	public void setPlace(String placeName) {
		//this.actualPlace = 
	}
	
	public City getActualCity() {
		return this.actualCity;
	}
	
	public void setActualCity(City actualCity) {
		this.actualCity = actualCity;
	}
	
	public Bag getBag() {
		return this.bag;
	}
}
