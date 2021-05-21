/**
TextProcessorApp is an application which performs the following tasks
		-- prompts the user to input a text
		-- uses the instantiable class TextProcessor to perform the actual translation of a word from english to Pig Latin
		-- retrieves the word in PigLatin and dipslays it

@author Florent Laot
*/

import java.util.Scanner;

public class TextProcessorApp {
    public static void main(String[] args) {

        // declare local variables
		String myText;

		Scanner input = new Scanner(System.in);

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
    }
    
}
