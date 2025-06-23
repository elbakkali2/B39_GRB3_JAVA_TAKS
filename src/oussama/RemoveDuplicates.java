package oussama;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));
    }

    public static String removeDup(String str) {
        String result = "";
// Initialize empty string to hold characters without duplicates

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Extract each character from the input string, one by one

            if (!result.contains("" + ch)) {
                // Check if 'result' does not contain the character yet

                result += ch;
                // If not, add the character to 'result'
            }
        }

        return result;
        // Return the string that now contains only unique characters, in original order
    }



        /*
        Remove Duplicates
        Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC            */
}
