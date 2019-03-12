//The program will pick a random word from a file that contains an extensive list of words.
//The program should show the player the word with all the letters "hidden". You can use "_" for hidding the letters.
//If the selected word is elephant. The output would show _ _ _ _ _ _ _ _.
//The user would then choose a letter, and if the letter is part of the word, it would get filled in. a. In our example, if the player guesse "l", they would see _ l _ _ _ _ _ _
//The program should show the player which letters have been guessed so far.
import java.io.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class GuessGame {

	static ArrayList<String> wordsList = new ArrayList<String>();

	// guessed will contain the guessed words as a string
	static String guessed = "";
	// current word tracks the current word guess
	static String currentWord = "";
	static int hangman = 0;
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		// tracker for when the game will end
		boolean done = false;
		// start the buffered reader
		BufferedReader in = null;
		String line = null;
		try {
			// the list of words is contained in the source as "words.txt"
			in = new BufferedReader(new FileReader("src/words.txt"));
			// read each line and add it to the word list
			while ((line = in.readLine()) != null) {
				wordsList.add(line);
			}
		} catch (FileNotFoundException e) {
			// catch if they can't find the file and just exit
			System.out.println("Error! File Not Found.");
			scn.close();
			System.exit(0);
		} catch (IOException e) {
			// if file is corrupted or something else happens just get outta here pal
			System.out.println("File not able to be read.");
			scn.close();
			System.exit(0);
		}
		// get the random word to use here
		String chosen = getWord();
		// create the blank spots from the master currentWord
		for (int i = 0; i < chosen.length(); i++) {
			currentWord += "_";
		}
		// the main part of the program. loops, prints the guess, and handles input.
		while (!done) {
			// print with the chosen word
			printMethod(chosen);
			// get the guess
			String guess = scn.nextLine();
			// send to checkGuess method with the chosen word and the guess
			checkGuess(guess, chosen);
			// check if the program is done
			done = checkWin(chosen);
			
		}
		// if done is true, we outcha
		System.out.println("Word is " + chosen);
		System.out.println("Congrats, you won!");
		scn.close();
		System.exit(0);
	}
	
	// getWord returns a String corresponding to a random word in the list gathered from the file
	// @params none
	static public String getWord() {
		// declare a new random number and get the index with the range of the arraylist
		Random ran = new Random();
		int ind = ran.nextInt(wordsList.size());
		// return the random index from the array list
		return wordsList.get(ind);
	}
	
	// printMethod returns nothing
	//@params String word to be printed
	// takes in the current guess state (for example "fi__"
	// and prints it with spaces in between
	static public void printMethod(String word) {
		
		for (int i = 0; i < currentWord.length(); i++) {
			System.out.print(currentWord.charAt(i) + " ");
		}
		// after printing, print the next instructions
		System.out.println("\nGuessed letters: " + guessed);
		System.out.println("What is your move?");
		System.out.print("> ");
		
	}
	
	// checkGuess inputs a guessed letter and the chosen true word, and sees if that guess is correct
	// this method is the meat of the program.
	// @params String guess, String chosen
	// returns none
	public static void checkGuess(String guess, String chosen) {
		// set changed to be false. If changed is ever true, that means a guess was correct
		boolean changed =false;
		// loop through the actual word and see if the guess matches anywhere
		for (int i = 0; i < chosen.length(); i++) {
			// if so...
			if (chosen.charAt(i) == guess.charAt(0)) {
				// since Strings are immutable make a new word from the guess
				// create a new current word with the guess included
				currentWord = currentWord.substring(0, i) + guess.charAt(0) + currentWord.substring(i + 1);
				System.out.println("Correct!");
				// changed is true
				changed = true;
			}
			
		}
		if (changed) {
			return;
		} else {
			System.out.println("Incorrect.");
			// officially add the letter to guessed if it is not changed
			guessed += guess.charAt(0) + ", ";
		}
	}
	
	// if the word we've guessed equals the chosen word, return true. Else return false
	public static boolean checkWin(String chosen) {
		if (chosen.equals(currentWord)) return true;
		return false;
	}
}
