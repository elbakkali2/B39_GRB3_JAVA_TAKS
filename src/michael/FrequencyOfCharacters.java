package michael;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(frequencyOfChar("AAABBCDD"));
    }
    /*
    String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String frequencyOfChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char each : str.toCharArray()){
            map.put(each, map.getOrDefault(each, 0)+1);
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }
}
