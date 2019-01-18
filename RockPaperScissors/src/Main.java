import java.util.*;
import java.math.*;
public class Main {
		public static void main(String[] args) {
			Random randnum;
			
			randnum = new Random();
			
			Scanner scn = new Scanner(System.in);
			
			System.out.print("You must choose, and choose wisely, for you are fighting against randomness. Rock, paper, or scissors?: " );
			String input = scn.nextLine().toLowerCase();
			while (!(input.equals("rock")) && !(input.equals("paper")) && !(input.equals("scissors"))) {
				System.out.println("Invalid, pick again:");
				input = scn.nextLine().toLowerCase();
			}
			String compMove;
			// generate random number
			int comp = (int)randnum.nextInt(10);
			if (comp <= 3) {
				compMove = "rock";
			} else if (4 <= comp && comp <= 7) {
				compMove = "paper";
			} else {
				compMove = "scissors";
			}
			
			try  {
				System.out.println("Calculating...");
				Thread.sleep(1000);
				System.out.println("Calculating...");
				Thread.sleep(1000);
				System.out.println("Calculating...\n");
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Well, that didn't work.");
			}
			
			System.out.println("Computer got " + compMove + " and you got " + input + "\n");	
			
			// calculate winner
			if (compMove.equals(input)) {
				System.out.println("It's a tie!");
			} else {
				if (input.equals("rock") && !(compMove.equals("paper"))) {
					System.out.println("You won!");
				} else if (input.equals("paper") && !(compMove.equals("scissors"))) {
					System.out.println("You won!");
				} else if (input.equals("scissors") && !(compMove.equals("rock"))) {
					System.out.println("You won!");
				} else {
					System.out.println("You lose, loser");
				}
				
			}
		}
	
}
