package oussama;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static String frequencyOfChars(String str) {
        // Create a LinkedHashMap to store character frequencies while preserving insertion order
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Loop through each character in the input string
        for (char ch : str.toCharArray()) {
            // Update frequency count: if char exists, increment by 1; otherwise, start at 1
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Use StringBuilder for efficient string concatenation
        StringBuilder result = new StringBuilder();

        // Iterate over the LinkedHashMap entries in insertion order
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // Append character and its frequency to the result
            result.append(entry.getKey()).append(entry.getValue());
        }

        // Convert StringBuilder to String and return the final frequency string
        return result.toString();
    }

    public static void main(String[] args) {
        // Test the method and print the result
        System.out.println(frequencyOfChars("AAABBCDD"));  // Output: A3B2C1D2
    }
}

    /*
            1.    String -- Frequency of Characters
        Write a return method that can find the frequency of characters
        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2  */

