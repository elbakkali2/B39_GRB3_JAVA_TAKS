package jerina;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintUniqueCharacters {
    public static void main (String [] args) {
        System.out.println(printUniqueCharacters("AAABBBCCCDEF"));
        System.out.println(printUniqueCharacters("AUTOMATION"));
        System.out.println(printUniqueCharacters("Error line 22"));
    }
    public static String printUniqueCharacters(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
         for(char ch : str.toCharArray()) {
             map.put(ch, map.getOrDefault(ch, 0) + 1);
         }
         StringBuilder result = new StringBuilder();
         for(Map.Entry<Character, Integer> entry : map.entrySet()) {
             if(entry.getValue() == 1) {
                 result.append(entry.getKey());
             }
         }
         return result.toString();

    }
}
