package woodson;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

        public static String frequencyOfChars(String str) {
            // Handle null or empty input string
            if (str == null || str.isEmpty()) {
                return "";
            }

            // Use LinkedHashMap to maintain the order of characters as they appear in the input string
            Map<Character, Integer> charFrequencyMap = new LinkedHashMap<>();

            // Iterate over the input string to count character frequencies
            for (char ch : str.toCharArray()) {
                // Get the current count of the character, or 0 if it's not in the map yet
                // Then, increment the count and put it back into the map
                charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
            }

            // Use StringBuilder to efficiently build the result string
            StringBuilder result = new StringBuilder();

            // Iterate over the map entries to construct the output string
            for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
                result.append(entry.getKey());    // Append the character
                result.append(entry.getValue());  // Append its frequency
            }

            return result.toString();
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println("Input: AAABBCDD, Output: " + frequencyOfChars("AAABBCDD")); // Expected: A3B2C1D2
            System.out.println("Input: javajava, Output: " + frequencyOfChars("javajava")); // Expected: j2a4v2
            System.out.println("Input: HelloWorld, Output: " + frequencyOfChars("HelloWorld")); // Expected: H1e1l3o2W1r1d1
            System.out.println("Input: 1223334444, Output: " + frequencyOfChars("1223334444")); // Expected: 11223344
            System.out.println("Input: , Output: " + frequencyOfChars("")); // Expected: ""
            System.out.println("Input: null, Output: " + frequencyOfChars(null)); // Expected: ""
            System.out.println("Input: A, Output: " + frequencyOfChars("A")); // Expected: A1
            System.out.println("Input: !@#$$%%%, Output: " + frequencyOfChars("!@#$$%%%")); // Expected: !1@1#1$2%3
        }
    }

