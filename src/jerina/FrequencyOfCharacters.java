package jerina;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD"));
        System.out.println(FrequencyOfChars("aBbcccBBA"));
        System.out.println(FrequencyOfChars("FrequencyOfCharacters"));
    }
    public static String FrequencyOfChars(String str) {
        Map<Character, Integer> frequency = new LinkedHashMap<>(); // ordered -> key-value structure

        for(char c : str.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        StringBuilder output = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            output.append(entry.getKey()).append(entry.getValue());
        }
         return output.toString();
    }
}


/*
String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */