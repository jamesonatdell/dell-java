import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Please type two numbers to the console.");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		
		String[] splitArray = input.split("\\s+");
		reader.close();
		int first = Integer.parseInt(splitArray[0]);
		int second = Integer.parseInt(splitArray[1]);
		// sum
		System.out.print("Sum: " + sum(first, second)+ "\n");
		// difference
		System.out.print("Difference: " + difference(first, second)+ "\n");
		// product
		System.out.print("Product: " + product(first, second)+ "\n");
		// quotient
		System.out.print("Quotient: " + quotient(first, second)+ "\n");
	}
	
	private static int sum(int first, int second ) {
		
		return first + second;
	}
	
	private static int difference(int first, int second ) {
			
			return first - second;
		}
	
	private static int product(int first, int second ) {
		
		return first * second;
	}
	
	private static int quotient(int first, int second ) {

		return first / second;
	}
	
}
