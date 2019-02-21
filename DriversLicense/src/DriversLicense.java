import java.util.Date;
import java.time.*;

// The Drivers License class has the following attributes
// Strimg First Name
// String Last Name
// LocalDate DOB
// int Height
// String Gender
// It has two methods, getFullName and getAge, that return the full name and age of the referencing DriversLicense object.

public class DriversLicense {

	String firstName;
	String lastName;
	LocalDate dob;
	int height;
	String gender;
	
	// @params none
	// @returns a String concatenation of the first and last name of the referencing DriversLicense object.
	String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	// @params none
	// @returns an int representing the age, the difference between the date of birth of the referencing drivers license holder and the current date.
	int getAge() {
		// grab today's date as a LocalDate object
		LocalDate today = LocalDate.now();
		// calculate the time difference between the referencing drivers license's date of birth and today
		Period period = Period.between(this.dob, today);
		// get the difference in years, being the age, and return it
		int age = period.getYears();
		return age;
	}
	
	// The license program has one method, the main method.
	// it parses through the arguments, creating three separate instances of the DriversLicense object,
	// and calculates the age and name of the DriversLicense, printing them out.
	public static class LicenseProgram {
		public static void main(String[] args) {
			// if the args are null, that means Eclipse didn't transfer over my arguments. They're in the args.txt text file.
			if (args == null) {
				System.out.println("Please add args.txt to your run configurations.");
			} else {
				// args are 0-14, with 0-4, 5-9, and 10-14 referencing three separate drivers license infos.
				// as such, I reference each args as +1 through + 4, and then increment i by 5 each time.
				for (int i =0; i < 15; i = i + 5) {
					// construct the new drivers license object
					DriversLicense license = new DriversLicense();
					// firstname and lastname are the first two args
					license.firstName = args[i];
					license.lastName = args[i + 1];
					// the date, structured as YYYY/MM/DD, is split by "/"
					String[] toDate = args[i + 2].split("/");
					// create the LocalDate object and assign it to the license as the date of birth
					license.dob = LocalDate.of(Integer.parseInt(toDate[0]), Integer.parseInt(toDate[1]), Integer.parseInt(toDate[2]));
					// height and gender are assigned last, as the last two args in the set
					license.height = Integer.parseInt(args[i + 3]);
					license.gender = args[i + 4];
					// call getAge() and getFullName(), and refreence gender to return the required information.
					System.out.println(license.getFullName() + " is " + license.getAge() + " years old. They identify as " + license.gender + ".");
				}
			}
		}
	}
}
