//Vehicle has the following fields:
//String license number
//String make
//String model
//double price
//Vehicle should have methods to do the following actions:
//print a description of the vehicle, including license number, make, model, and price
public abstract class Vehicle {
	String licenseNumber;
	String make;
	String model;
	double price;
	
	// @override
	// @params none
	// a toString of a generic Vehicle object.
	public String toString() {
		return this.make + " " + this.model + " with license plate number " + this.licenseNumber + ". It costs $" + this.price;
	};
}
