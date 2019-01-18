import java.util.Scanner;

public class helloworld {
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("If you type your name into the next line you agree to pay $10,000 to me, Jameson");
		String resp = scn.next();
		System.out.println("Hi " + resp + ", hope you are doing well.");
	}
	
}