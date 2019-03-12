// The garage manager class contains the main method of the program, taking in the String array of args as the argument. 
// It creates an instance of the Cars ArrayList to manage the cars passed in from the args.
// It then creates three instances of the ParkingGarage object, with varying sizes.
// It adds cars to the car array, then parks, vacates, and prints from the various garages.

import java.util.*;
public class GarageManager {
	public static void main(String[] args) {
		// Instantiate the ArrayList of Car objects
		ArrayList<Car> cars = new ArrayList<Car>();
		// create three new parking garages with three different sizes
		ParkingGarage AtlantisGarage =new ParkingGarage(10);
		ParkingGarage EverestGarage = new ParkingGarage(1);
		ParkingGarage MiddleOfUtahGarage =new ParkingGarage(5);
		
		// String color, String licenseNumber, String make, String model
//		Red, 123ABC, Mercedes-Benz, SL500
//		Silver, DRMABC, Lamberati, Utah
//		Orange, GARAGEE, Maserghini, SouthDakota
//		Blue, PHOOEY, NewLamborghiniHere, HollywoodHills
		for (int i = 0; i < args.length; i= i + 4) {
			// create new cars from the args listed above
			cars.add(new Car(args[i], args[i + 1], args[i + 2], args[i + 3]));
		}
		
		// park cars in empty spots
		AtlantisGarage.park(cars.get(0), 0);
		AtlantisGarage.park(cars.get(3), 1);
		AtlantisGarage.park(cars.get(2), 2);
		AtlantisGarage.park(cars.get(1), 3);
		// try to vacate the same spot twice
		AtlantisGarage.vacate(1);
		AtlantisGarage.vacate(1);
		// print inventory
		AtlantisGarage.printInventory();
		
		// repeat for the rest of the garages
		EverestGarage.park(cars.get(0), 0);
		EverestGarage.park(cars.get(1), 0);
		EverestGarage.park(cars.get(2), 0);
		EverestGarage.vacate(0);
		// park, vacate, park again
		EverestGarage.park(cars.get(3), 0);
		EverestGarage.printInventory();
		
		MiddleOfUtahGarage.park(cars.get(0), 4);
		MiddleOfUtahGarage.park(cars.get(1), 3);
		MiddleOfUtahGarage.park(cars.get(2), 2);
		MiddleOfUtahGarage.park(cars.get(3), 1);
		MiddleOfUtahGarage.vacate(0);
		MiddleOfUtahGarage.printInventory();
		// end
	}
	
}


