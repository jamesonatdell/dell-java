//CarLot has the following fields
//String name
//list of vehicles
//CarLot has methods to do the following actions:
//add a vehicle to the lot
//print the inventory of the car lot, including number of vehicles and details about each vehicle
import java.util.*;
public class CarLot {
	String name;
	// make a new ArrayList of Vehicle objects
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	// check to make sure Vehicle input is valid even tho I write the whole program
	// @params Vehicle object to be added
	public boolean add(Vehicle vehicle) {
		if (vehicle.equals(null)) {
			return false;
		}
		vehicles.add(vehicle);
		return true;
	}
	
	// Call each individual vehicles's toString method while looping through the ArrayList of Vehicles
	// @params none
	public void lotToString() {
		System.out.println("There are " + vehicles.size() + " vehicles. Here they are:");
		for (int i = 0; i < vehicles.size(); i++) {
			System.out.println(vehicles.get(i).toString());
		}
		System.out.println();
	}
}
