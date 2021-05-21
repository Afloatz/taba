/**
TextProcessorApp is an application which performs the following tasks
QUESTION 1
		-- prompts the users the number of paragraph they want to enter
		-- prompts the user to input texts
		-- uses the instantiable class TextProcessor to perform the actual encoding of the texts
		-- retrieves the encoded texts and dipslays them
QUESTION 2
		-- prompts the users the number of wordsh they want to enter
		-- prompts the user to input words
		-- uses the instantiable class TextProcessor to find the longest words
		-- retrieves the longest words and dipslays them		

@author Florent Laot
*/

import java.util.Scanner;

public class TextProcessorApp {
    public static void main(String[] args) {

        // declare local variables
		String myText;
		String myWord;

		Scanner input = new Scanner(System.in);

// QUESTION 1

        // input
		// prompt the user for the number of paragraphs
		System.out.println("enter the number of paragraghs you want to encode:");
		int n = input.nextInt();

		TextProcessor encoder = new TextProcessor();

		// next, we use a loop statement because the users can enter as many paragraph as they want, namely the number of paragraphs stored above in the n variable
		for (int i = 0; i < n; i++){	
			// prompt the user to provide a paragraph
			System.out.println("enter a paragragh: ");
			input = new Scanner(System.in);
			myText = input.nextLine();
			// use the setter method to store the user's text into the object's instance variable text
			encoder.setText(myText);

			// processing: call the method encodeText() to apply the ER2 rule to encode the text
			encoder.encodeText();

			// output
			// use the getter method to retrieve the encoded text
			String myEncodedText = encoder.getEncodedText();
			System.out.println("Encoded paragraph is: " + myEncodedText);
			System.out.println("==================================================================================================================================");

		}  

// QUESTION 2

		// prompt the user for the number of words
		System.out.println("enter the number of words:");
		int m = input.nextInt();

		String[] someWords = new String[m];

		for (int i = 0; i < m; i++){	
			// prompt the user to enter a word
			System.out.println("enter a word: ");
			myWord = input.next();

			// store myWord in the someWords array at index i
			someWords[i] = myWord;
		}

		// processing: call the method findLongestWords() to find the longest words and store them in an array
		String[] longestWords = encoder.findLongestWords(someWords);

		// display the longest words
		System.out.println("==================================================================================================================================");
		System.out.println("The longest word(s) : ");
		// traverse the array longestWords to display the elements one after the other
		for (int i = 0; i < longestWords.length; i++){
			// the longestWords array has the size of the words array (cf TextProcessor), therefore we display only if the element exist  
			if (longestWords[i] != null){
				System.out.println(longestWords[i]);
			} else {
				break; // exit the loop if the array element is null i.e the array does not contain anymore words
			}
		}

    }
}
