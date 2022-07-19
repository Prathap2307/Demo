package DSA;

import java.util.ArrayList;
import java.util.List;

public class DuplicateWord {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";

		// String string = "Big black bug bit a big test black dog test on his big black
		// nose test";

		// int count;

		// Converts the string into lowercase
		string = string.toLowerCase();

		// Split the string into words using built-in function
		// String words[] = string.split(" ");

		// String wordsDuplicated[] = string.split(" ");

		/*
		 * System.out.println("Duplicate words in a given string : "); for(int i = 0; i
		 * < words.length; i++) { count = 1; for(int j = i+1; j < words.length; j++) {
		 * if(words[i].equals(words[j])) { // count++; //Set words[j] to 0 to avoid
		 * printing visited word //words[j] = "0"; } }
		 * 
		 * //Displays the duplicate word if count is greater than 1 if(count > 1 &&
		 * words[i] != "0") System.out.println(words[i]); }
		 */

		String words[] = string.split(" ");
		
		String[] stringArrDuplicateElementsList =  new String[5];

		List<String> duplicateElements = new ArrayList<>();
		
		int dublicateCount = 0;
		for(int i = 0; i  < words.length; i++) {
			
			for(int j = i+1; j < words.length; j++) {
				
				//System.out.println("TEST -->" + words[i] +"-->" +  words[j]);
				
				if(words[i].equalsIgnoreCase(words[j])) {
					dublicateCount++;
					if(dublicateCount > 1 && !duplicateElements.contains(words[i])) {
						duplicateElements.add(words[i]);
						
						// ALTERNATE METHOD
						//stringArrDuplicateElementsList[i] = words[i];
					}
					
				}
				
			}
			  
		}
		
		for(String s : duplicateElements) {
			System.out.println(s);
		}
		
		// ALTERNATE OUTPUT
		/*
		 * System.out.println("\n"); for(String s : stringArrDuplicateElementsList) {
		 * 
		 * System.out.println("stringArrDuplicateElementsList --> "+s); }
		 */
		
	}

}
