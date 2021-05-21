/**
TextProcessor -- an instantiable class to encode a text using ER2 encoding rule
    -- Before each consonant add the first letter of your last name twice.
    -- The encoded text ends with the number of characters in the initial text excluding the number of vowels (including the number of spaces).

 @author Florent Laot
*/

public class TextProcessor {

    // declare instance variables/data members
    private String text;
    private String encodedText;

    public TextProcessor(){
        text = ""; // initialize the text with the empty string, otherwise the text instance variable is initialized with null
    }

    // setter method to assign a value to the intance variable text
    public void setText(String text) {
        this.text = text;
    }

    // getter method to return the encoded text
    public String getEncodedText() {
        return encodedText;
    }

    // declare the processing/ compute method -- encode a given text to a new text using ER2 encoding rule
    public void encodeText() {
        
        int counter = 0;
        StringBuffer sb = new StringBuffer();

        // traverse the entire text
		int len = text.length();
		for (int i = 0; i < len; i++){
            // retrieve the current character at the index i
			char c = text.charAt(i);

            // check if the current character is not a consonant (i.e a vowel, space, or allowed special character) since we have a specific rule for encoding a consonant
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U' || c == ' ' || c == '.' || c == '!' || c == '?'){
                sb.append(c);
            } else { // if the letter is a consonant apply the encoding rule:
                // before each consonant add the first letter of your last name twice, which is L.
                sb.append("LL");
                sb.append(c);
            }

            // check if the current character is not a vowel to count the number of characters in the text excluding vowels
            if (!(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')){
                counter++;
            }
        }

        // add at the end of the encoded text the number of characters in the initial text excluding the number of vowels (including the number of spaces).
        sb.append(counter);

        // convert the StringBuffer instance to a String instance, and save it in the instance variable encodedText
        encodedText = sb.toString();
        
    }

}