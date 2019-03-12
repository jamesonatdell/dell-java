import java.util.*;

public class Gradebook {
	
	static HashMap<String, String> gradebook = new HashMap<String, String>();
	static HashMap<String, Double> finalGrades = new HashMap<String, Double>();
	static HashMap<String, Double> pointValues = new HashMap<String, Double>();
	
	public static void main (String[] args) {
		// add the grade point equivalences
		pointValues.put("A", 4.0);
		pointValues.put("AB", 3.5);
		pointValues.put("B", 3.0);
		pointValues.put("BC", 2.5);
		pointValues.put("C", 2.0);
		pointValues.put("CD", 1.5);
		pointValues.put("D", 1.0);
		pointValues.put("F", 0.0);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("How many students are in the gradebook?");
		int numOfStudents = scn.nextInt();
		scn.nextLine();
		// loop through for however many students there are
		while (numOfStudents > 0) {
			System.out.println("List each student and their grades, in this format - John, A, A, B, B, C - ");
			addToSet(scn.nextLine());
			numOfStudents--;
		}
		// call functions to convert, print grades, and close the scanner.
		ConvertToGrade();
		printGrades();
		scn.close();
		
	}
	
	// add the first value as the key, and concatenate the second value as a string in the hash set
	public static void addToSet(String toParse) {
		String[] parsed = toParse.split(", ");
		String key = parsed[0];
		String value = "";
		for (int i = 1; i < parsed.length; i++) {
			value += parsed[i] + ",";
		}
		gradebook.put(key, value);
	}
	
	
	// convert comma separated values into a grade in the new hashset
	public static void ConvertToGrade() {
		// define our GPA variable to add values to
		double gpa = 0.0;
		// loop through the key values which correspond to the person
		for (String key : gradebook.keySet()) {
			// split the value of the key by commas, which is the grades.
			String[] toSplit = gradebook.get(key).split(",");
			// loop through the grades to convert to a number value
			for (int i = 0; i < toSplit.length; i++) {
				gpa += pointValues.get(toSplit[i]);
			}
			// divide GPA by the amount of grades to get final GPA
			gpa = gpa / toSplit.length;
			// add it to the set
			finalGrades.put(key, gpa);
			gpa = 0;
		}
	}
	
	public static void printGrades() {
		for (String key : finalGrades.keySet()) {
			System.out.println(key + " got a final grade of " + finalGrades.get(key) + ".");
		}
	}
}
