package victorbenitez;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
        System.out.println(frequencyOfChars("aBbcccBBA"));
        System.out.println(frequencyOfChars("FrequencyOfCharacters"));
    }

    public static String frequencyOfChars(String str) {
        StringBuilder result = new StringBuilder();
        while (!str.isEmpty()) {
            char ch = str.charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            result.append(ch).append(String.valueOf(count));
            str = str.replaceAll(String.valueOf(ch), "");
        }
        return result.toString();
    }
}

/*
1.    String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */