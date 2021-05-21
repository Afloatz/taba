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
		Scanner in = new Scanner(System.in);
		String myText;

		TextProcessor encoder = new TextProcessor();

		// input
		// prompt the user to provide a paragraph
		System.out.println("enter a paragragh: ");
		myText = in.nextLine();
		encoder.setText(myText);

		// processing
		encoder.encodeText();

		// output
		String myEncodedText = encoder.getEncodedText();
		System.out.println("Encoded paragraph is: " + myEncodedText);
        
    }
    
}
