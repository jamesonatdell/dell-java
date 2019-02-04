// Room is an implementation of the Rentable interface
// it has two attributes, dailyRate and description.
// It has the following methods
//String getDescription(); returns the description of the item.
//double getDailyRate(); returns the daily rate for renting the item
//double getPrice(double days); returns the amount due for renting the item for the a given number of days.
public class Room implements Rentable {
	// the daily rate of the room
	double dailyRate;
	// a description of the room 
	String description;
	
	// returns the description of the object as a String
	public String getDescription() {
		return this.description;
	}
	
	
// returns the daily rate of the room as a double
	public double getDailyRate() {
		return this.dailyRate;
	}
	
	// returns the price for a x day stay by multiplying the daily rate by the number of days
	public double getPrice(double days) {
		return days*dailyRate;
	}
	
	// the constructor for the Room, assigning the args to the respective variables
	public Room(double rate, String description) {
		this.dailyRate = rate;
		this.description = description;
	}
}
