//The Truck subclass has the following fields:
// double bedSize
// Inherited from the super class
// String licenseNumber;
//	String make;
//	String model;
//	double price;
public class Truck extends Vehicle{
	double bedSize;
	
	// returns the size of the bed of the referenced Truck object
	public double bedSize() {
		return this.bedSize;
	}
	
	// uses the super's toString and includes the bedsize of the referenced object
	public String toString() {
		return "This truck is a " + super.toString() + " and it has a bed that is " + this.bedSize + " feet long.";
	}
	
	// constructor
	//@params double bedSize, String licenseNumber, String make, String model, double price
	public Truck(double bedSize, String licenseNumber, String make, String model, double price) {
		this.bedSize = bedSize;
		this.licenseNumber = licenseNumber;
		this.make = make;
		this.model = model;
		this.price = price;
	}
}
