package Maryna;

/*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

public class FrequencyOfCharacters {

    //This method takes a string and returns the frequency of each character
    public static String frequencyOfCharacters(String str) {
        StringBuilder result = new StringBuilder();
        String checked = "";

        //Loop through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            // Only count the character if we haven't already processed it
            if (!checked.contains("" + ch)) {
                int count = 0;

                // Count how many times this character appears in the entire string
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++; // Increase the count if the character matches
                    }
                }

                //Add the character and its count to the result
                result.append(ch).append(count);

                // Mark this character as "checked" so we don't count it again
                checked += ch;
            }

        }

        // Convert the StringBuilder to a string and return the result
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("aabbccddffee"));
        System.out.println(frequencyOfCharacters("ffggggghhh"));
    }

}


