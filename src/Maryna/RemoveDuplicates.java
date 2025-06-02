package Maryna;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {

        // StringBuilder to store the result without duplicates
        StringBuilder result = new StringBuilder();

        // Convert the input string to a character array and loop through each character
        for (char ch : str.toCharArray() ) {

            // Check if the character is already in the result
            // indexOf returns -1 if the character is NOT found

            if (result.indexOf(String.valueOf(ch)) == -1) {

                // If the character is not already in result, add it
                result.append(ch);
            }
        }

        // Return the result as a string
        return result.toString();

    }


    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
        System.out.println(removeDuplicates("RRRFRHGFSHGFGHFDSFDFDSD"));

    }


}
