//In your main method:
//You should instantiate 2 different car lots, and add various vehicles to the car lots.
//Print out the inventory for each of the car lots, showing the details for each vehicle.
//When printing out the details, print the appropriate info for a car, or a truck accordingly.

// CarLotProgram has one method, the main method.
// It creates two CarLot objects, adds cars and trucks to them, and prints the results.
public class CarLotProgram {
	public static void main(String[] args) {
		// create new CarLot objects
		// https://www.youtube.com/watch?v=FyOX4G7TmE0
		CarLot redZone = new CarLot();
		CarLot whiteZone = new CarLot();
		// create and add new cars and trucks, with attributes below
//		Car: (coupe, hatchback, or sedan)
//		Car(String type, int numDoors, String licenseNumber, String make, String model, double price
//		Truck(double bedSize, String licenseNumber, String make, String model, double price)
		redZone.add(new Car("Coupe", 2, "CHEERS0", "Mercedes-Benz", "SL500", 50000));
		redZone.add(new Car("Coupe", 2, "CHEERS1", "BMW", "M3", 40000));
		redZone.add(new Car("Hatchback", 4, "CHEERS2", "Volkswagen", "Focus", 30000));
		redZone.add(new Car("Hatchback", 5, "CHEERS3", "Mercedes-Benz", "SL63", 20000));
		redZone.add(new Car("Sedan", 4, "CHEERS4", "Maserati", "Quattroporte", 100000));		
		redZone.add(new Car("SUV", 8, "SURBMOM", "Suburban", "Pink", 34000));

		
		redZone.add(new Truck(42, "Ch33rs0", "Toyota", "Tacoma", 100000));
		// print out the RedZone's attributes
		System.out.println("Red Zone:");
		redZone.lotToString();
		
		// do the same for the slightly smaller white zone
		whiteZone.add(new Car("Coupe", 2, "LAMBOOO", "Maserghini", "StudioGhibli", 500000));
		whiteZone.add(new Car("Coupe", 2, "FERRRRR", "Lamberati", "Tractor", 400000));
		whiteZone.add(new Car("Sedan", 4, "SKRTTT", "Sherman", "Tank", 30000));
		whiteZone.add(new Car("Hatchback", 4, "CHEERS4", "Mazdarati", "CincoDeMayoPorte", 100000));
		
		whiteZone.add(new Truck(42, "Ch33rs0", "Nissan", "MeSon", 100000));
		System.out.println("White Zone:");
		whiteZone.lotToString();
		
		// end
	}
}
