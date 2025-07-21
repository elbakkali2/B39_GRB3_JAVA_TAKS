package oussama;

import java.util.HashMap;


public class Unique_Characters {
    /*  Find the unique
        Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static void main(String[] args) {
        String myCharacter = "AAABBBCCCDEF";
        String result = unique(myCharacter);
        System.out.println(result);  // Output: DEF
    }

    public static String unique(String characters) {
        // Create a map to store the frequency of each character
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Loop through the string and count frequency of each character
        for (char eachCharacter : characters.toCharArray()) {
            charCount.put(eachCharacter, charCount.getOrDefault(eachCharacter, 0) + 1);
        }

        // Build the result string containing only unique characters
        StringBuilder result = new StringBuilder();
        for (char eachChar : characters.toCharArray()) {
            if (charCount.get(eachChar) == 1) {  // Character appears only once
                result.append(eachChar);
            }
        }

        return result.toString();
    }
}


