import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Item i1 = new ItemMoney("Argent", 10);
		Item i2 = new ItemTicket("Ticket", 1);
		System.out.println(i1.getDescription());
		System.out.println(i2.getDescription());
		
		/*ArrayList <String> listCity;
		listCity.add("Paris"); listCity.add("Bordeaux"); listCity.add("Marseille");
		listCity.add("Lyon"); listCity.add("Lille"); listCity.add("Rennes"); 
		listCity.add("Strasbourg"); listCity.add("La Rochelle"); listCity.add("Nantes");
		listCity.add("Toulouse"); listCity.add("Montpellier"); listCity.add("Nice");
		listCity.add("Brest"); listCity.add("Dijon"); listCity.add("Reims");
		listCity.add("Le Havre"); listCity.add("Poitiers");*/
		
		ArrayList <String> listCityUpdate = null;
		
		
		listCityUpdate.add("La Rochelle"); listCityUpdate.add("Nantes"); 		
		City city1 = new City("Poitiers", false, listCityUpdate);
		listCityUpdate.clear();
		listCityUpdate.add("Poitiers"); listCityUpdate.add("Bordeaux");
		City city2 = new City("La Rochelle", false, listCityUpdate);
		listCityUpdate.clear();
		
		
		/*
		poitiers.updateDestination()
		si "bordeaux" == listCity[i].getName() 
		then poitiers.setDestination(listCity[i]);
		poitiers.setDestination(listCity)
			//	listCity.add(poitiers);*/
	}
}
