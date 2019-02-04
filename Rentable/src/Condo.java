// Condo is an implementation of the Rentable interface
// it has two attributes, weeklyRate and description.
// It has the following methods
//String getDescription(); returns the description of the item.
//double getDailyRate(); returns the daily rate for renting the item
//double getPrice(double days); returns the amount due for renting the item for the a given number of days.
public class Condo implements Rentable{
	double weeklyRate;
	String description;
//	getDescription(); returns the description of the item.
//	getDailyRate(); returns the daily rate for renting the item
//	getPrice(double days); returns the amount due for renting the item for the a given number of days.

	// returns the description of the object as a String
	public String getDescription() {
		return this.description;
	}
	
	// returns the daily rate of the room as a double by dividing the weekly rate by 7
	public double getDailyRate() {
		return weeklyRate / 7;
	}
	
	// returns the price for a x day stay by multiplying the daily rate by the number of days
	public double getPrice(double days) {
		return (weeklyRate / 7) * days;
	}
	
	// the constructor for the Room, assigning the args to the respective variables
	public Condo(int rate, String description) {
		this.weeklyRate = rate;
		this.description = description;
	}
}
