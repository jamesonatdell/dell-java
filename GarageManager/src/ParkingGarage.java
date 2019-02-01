// The ParkingGarage class has the following attributes
// Car[] carArray, which is an array containing the Car objects in the garage.
// it has four methods, park, vacate, printInventory, and a constructor.
public class ParkingGarage {
	// instantiate the carArray with no size
	private Car[] carArray;
	
	//@params Car car, int spot
	// the park method takes in a new Car object and an int pointing to the spot in the garage
	// it returns false if the spot is full, with an error message
	// if not, it places the car in the spot and returns true.
	public boolean park(Car car, int spot){
		
		if (carArray[spot] != null) {
			System.out.println(spot + " is full, bet you feel realllll stupid.");
			return false;
		}
		carArray[spot] = car;
		return true;
		
	}
	
	// @params int spot
	// the vacate method takes an int corresponding to the spot as its argument.
	// it returns false if the intended spot to vacate is empty, and prints an error message
	// otherwise, it changes the value of the spot to null and returns true.
	public boolean vacate(int spot){
		
		if (carArray[spot] == null) {
			System.out.println("You can't remove an empty spot! That's like dividing by zero.");
			return false;
		}
		carArray[spot] = null;
		return true;
		
	}
	
	//@params none
	// printInventory() takes in no arguments and loops through the current carArray.
	// it prints out the spot number and the car in the occupied spot. It does not print out unoccupied spots.
	public void printInventory() {
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
			System.out.println("Spot " + i + " is occupied by a " + carArray[i].toString());
			}
		}
	}
	
	//@params int capacity
	// the ParkingGarage constructor takes in an int corresponding to the capacity and finishes creating the carArray object
	// with a size corresponding to the capacity.
	public ParkingGarage(int capacity) {
		carArray = new Car[capacity];
	}
}
