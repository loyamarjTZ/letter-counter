/*
This program asks the user to input a string consisting of all lowercase
letters and no spaces, then displays the frequency of each letter found 
in the string.
*/

//Importing Scanner class
import java.util.Scanner;

//Class LetterCounter definition
public class LetterCounter {
	
    	//Static variables
	public static int[] alphabetCount = new int[26];
	public static int i, j = 0;
	public static boolean charactersMatched = false;
	public static String input;
	
    	//Main function
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string with all lowercase letters: ");
		input = scan.nextLine();
        	System.out.println("\nYou entered: " + input + "\n");
        	LetterCounter.countLetters(input);
		LetterCounter.displayLetterFrequency();
        	scan.close();
		System.out.println("Goodbye!\n");
	}
	
	//PRECONDITION: String "input" is written in all lower case letters with no spaces.
	//POSTCONDITION: Array "alphabetCount" is updated with the frequency of each letter.
	public static void countLetters(String s){	
		for(i = 0; i < s.length(); i++){
			j = 0;
			charactersMatched = false;
			while(charactersMatched != true){
				if (s.charAt(i) == (char)(97 + j)){
					charactersMatched = true;
					alphabetCount[j] += 1;
                		} else
                    			j++;
            		}
        	}
    	}

    	// Displays the frequency of each letter in the input String.
    	public static void displayLetterFrequency() {
        	System.out.println("Letter : Count");
        	for (i = 0; i < 26; i++) {
            		System.out.println(((char) (97 + i)) + " : " + alphabetCount[i]);
		}
        	System.out.println();
	}
}
