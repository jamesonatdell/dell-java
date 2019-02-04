// Tool is an implementation of the Rentable interface
// it has two attributes, weeklyRate and description.
// It has the following methods
//String getDescription(); returns the description of the item.
//double getDailyRate(); returns the daily rate for renting the item
//double getPrice(double days); returns the amount due for renting the item for the a given number of days.
// a constructor with the args rate and description
public class Tool implements Rentable{
	// rate for the tool for an hour
	double hourlyRate;
	// description of the tool
	String description;

	// returns the description of the object as a String
	public String getDescription() {
		return this.description;
	}
	
	// returns the daily rate of the room as a double by multiplying the hourly rate by 7
	public double getDailyRate() {
		return hourlyRate * 24;
	}
	
	// returns the price for a x day stay by multiplying the daily rate by the number of days
	public double getPrice(double days) {
		return (hourlyRate * 24) * days;
	}
	
	// the constructor for the Room, assigning the args to the respective variables
	public Tool(int rate, String desc) {
		this.hourlyRate = rate;
		this.description = desc;
	}
}
