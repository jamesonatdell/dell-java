//An interface called Rentable
// this interface requires the following methods

//getDescription(); returns the description of the item.
//getDailyRate(); returns the daily rate for renting the item
//getPrice(double days); returns the amount due for renting the item for the a given number of days.
public interface Rentable {
	String getDescription();
	double getDailyRate();
	double getPrice(double days);
}
