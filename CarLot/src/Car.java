//The Car subclass has the following fields:
//type (coupe, hatchback, or sedan)
//number of doors
// Inherited from the super class
// String licenseNumber;
//	String make;
//	String model;
//	double price;
public class Car extends Vehicle{
	String type;
	int numDoors;
	
	// returns the type of the referenced car
	public String getType() {
		return this.type;
	}
	
	// returns the number of doors of the referenced car
	public int numDoors() {
		return this.numDoors;
	}
	
	// toString using the super's toString including type and doors
	public String toString() {
		return "This " + this.type + " is a " + super.toString() + " and it has " + this.numDoors + " doors.";
	}
	
	// constructor
	// @ params String type, int numDoors, String licenseNumber, String make, String model, double price
	public Car(String type, int numDoors, String licenseNumber, String make, String model, double price) {
		this.type = type;
		this.numDoors = numDoors;
		this.licenseNumber = licenseNumber;
		this.make = make;
		this.model = model;
		this.price = price;
	}
}
