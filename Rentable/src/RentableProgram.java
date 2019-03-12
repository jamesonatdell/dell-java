// the RentableProgram is the driver class for our Rentable interface and
// its three implementations, Room, Condo, and Tool.

// It has one method, the main method.
// It creates and adds rooms, condos, and tools to an ArrayList of tools. It then loops
// through the list printing out the description of each Rentable as well as its daily rate.
// It then asks the user for input and calculates the total charge for renting for x amount
// of days, where x is the day amount the user inputs.
// it prints this to the user.
import java.util.*;
public class RentableProgram {
	public static void main(String[] args) {
		// create a new ArrayList of Rentables and add Rentable objects to them
		ArrayList<Rentable> toRent = new ArrayList<Rentable>();
		toRent.add(new Room(6, "Cheap room"));
		toRent.add(new Room(6000, "Expensive room"));
		toRent.add(new Condo(450000, "Reallllll expensive condo"));
		toRent.add(new Room(-6, "room they pay you to stay in"));
		toRent.add(new Condo(500, "condo with only three walls"));
		toRent.add(new Tool(5000, "reallllll nice chainsaw"));
		toRent.add(new Tool(6, "regular ol' hammer"));
		
		// loop through and print the description and daily rate
		for (int i = 0; i < toRent.size(); i++) {
			System.out.println("You're looking at renting a " + toRent.get(i).getDescription() + 
					" and the daily rate is $" + toRent.get(i).getDailyRate());
		}
		
		// ask the user for input for number of days
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter a number of days to calculate pricing: ");
		int days = Integer.parseInt(scn.nextLine());
		// calculate the rate for each rentable and print it to the console
		for (int i = 0; i < toRent.size(); i++) {
			System.out.println("To rent the " + toRent.get(i).getDescription() + " for " + days + " days, you must pay $" + toRent.get(i).getPrice(days));
		}
		scn.close();
	}
}
