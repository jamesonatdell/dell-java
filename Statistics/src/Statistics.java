import java.util.*;
public class Statistics {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Please enter a list of numbers separate by commas: ");
		String[] toSplit = scn.nextLine().split(", ");
		int[] nums = new int[toSplit.length];
		for (int i = 0; i < toSplit.length; i++) {
			nums[i] = Integer.parseInt(toSplit[i]);
		}

		// call all of the functions
		min(nums);
		max(nums);
		numOfElems(nums);
		average(nums);
		sum(nums);
		scn.close();
		}
		
	
	// min
	public static void min(int[] args) {
		int min = args[0];
		for (int i = 0; i < args.length; i++) {
			if (args[i] < min) {
				min = args[i];
			}
		}
		System.out.println("Min is " + min);
	}
	
	// max
	public static void max(int[] args) {
		int max = args[0];
		for (int i = 0; i < args.length; i++) {
			if (args[i] > max) {
				max = args[i];
			}
		}
		System.out.println("Max is " + max);
	}
	
	
	// number of elements
	public static void numOfElems(int[] args) {
		System.out.println("There are " + args.length + " elements.");
	}
	
	// average
	public static void average(int[] args) {
		double avg = 0;
		
		for (int i = 0; i < args.length; i++) {
			avg += args[i];
		}
		System.out.println("Average is " + (avg / args.length));
	}
	
	
	// sum
	public static void sum(int[] args) {
		int avg = 0;
		for (int i = 0; i < args.length; i++) {
			avg += args[i];
		}
		System.out.println("The sum of the numbers is " + avg);
	}
	
}
