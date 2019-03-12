// the car class has the following attributes
// String color
// String licenseNumber
// String make
// String model
// it has 6 methods including a constructor
public class Car {
	private String color;
	private String licenseNumber;
	private String make;
	private String model;
	
	// returns the color of the referenced car object as a String
	// @params none
	public String getColor() {
		return this.color;
	}
	
	// returns the license plate number of the referenced car object as a String
	// @params none
	public String getLicenseNumber() {
		return this.licenseNumber;
	}
	
	// returns the make of the referenced car object as a String
	// @params none
	public String getMake() {
		return this.make;
	}
	
	// returns the model of the referenced car object as a String
	// @params none
	public String getModel() {
		return this.model;
	}
	
	// creates a new instance of the Car method
	// @params String color, String licenseNumber, String make, String model
	public Car(String color, String licenseNumber, String make, String model) {
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.make = make;
		this.model = model;
	}
	
	// @override 
	// implementation of the toString, returning a String representation of the car.
	public String toString() {
		return this.getColor() + 
				" " + this.getModel() + " " + this.getMake() + " with license plate number " + this.getLicenseNumber();
	}
}
