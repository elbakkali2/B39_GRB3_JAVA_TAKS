package esmira;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String absd = "AAABBCDD";
        System.out.println(frequencyOfChars(absd)); // A3B2C1D2
    }

    public static String frequencyOfChars(String absd) {
        String result = "";

        for (int i = 0; i < absd.length(); i++) {
            char ch = absd.charAt(i);

            // Only count if not already counted
            if (result.indexOf(ch) == -1) {
                int count = 0;

                for (int j = 0; j < absd.length(); j++) {
                    if (absd.charAt(j) == ch) {
                        count++;
                    }
                }

                result += ch + String.valueOf(count);
            }
        }

        return result;
    }


}
/**
 * String -- Frequency of Characters
 * Write a return method that can find the frequency of characters
 * Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

/*
String str = "bbcccaaaaa";

        Map<Character, Integer> counter = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            if(!counter.containsKey(key)) {
                counter.put(key, 0);
            }
            counter.put(key, counter.get(key) + 1);
        }
        System.out.println(counter);
 */