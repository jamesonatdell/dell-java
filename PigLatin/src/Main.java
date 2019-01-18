import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		boolean breakState = false;
		while (!breakState) {
			System.out.println("Please input a word. Choose wisely, as it can't be changed.");
			String input = scn.next().toLowerCase();
			breakState = pigLatin(input);
		}
		
	}
	
	private static boolean pigLatin(String input) {
		
		
		
		if (input.equals("wisely")) {
			System.out.println("Okay, wise guy.");
			return false;
		}
		if (input.equals("changed")) {
			System.out.println("Verrrrrrrrry funny.");
			return false;
		}
		
		String vowels = "aeiou";
		boolean vowelFlag = false;
		boolean consonantFlag = false;
		int intFlag = 0;
		// loop through the input
		for (int i = 0; i < input.length(); i++) {
			// loop through the vowels list to compare to the input
			for (int j = 0; j < vowels.length(); j++) {
				// walk through the vowels list for each input char and compare the,
				if (input.charAt(i) == (vowels.charAt(j))) {
					// if there is a vowel, and it's the first letter, mark vowel flag and break
					if (i == 0) {
						vowelFlag = true;
						break;
					}
					// if there is a vowel and it isn't the first letter, it's a consonant
					intFlag = i;
					consonantFlag = true;
					break;
				}
			}
			if (consonantFlag || vowelFlag) {
				break;
			}
		}
		
		if (vowelFlag) {
			System.out.println(vowel(input));
		} else if (consonantFlag) {
			System.out.println(consonant(input, intFlag));
		} else {
			System.out.println(noVowel(input));
		}
		
		return true;
	}
	
	// vowel
	public static String vowel (String word) {
		return word + "yay";
	}
	
	// consonant
	
	// If a word starts with a consonant, and has a vowel in the word, 
	// move all the letters before the initial vowel to the end, then add "ay". (pig -> igpay)
	public static String consonant (String word, int i) {
		String newString = word;
		String firstWord = word.substring(0,  i);
		String secondWord = word.substring(i);
		newString = secondWord + firstWord + "ay";
		return newString;
	}
	// no vowel
	public static String noVowel (String word) {
		return word + "ay";
	}
}
