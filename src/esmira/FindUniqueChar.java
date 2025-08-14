package esmira;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindUniqueChar {
    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println(unique(str)); // Output: DEF
    }

    public static String unique(String str) {
        List<String> chars = new ArrayList<>(Arrays.asList(str.split("")));

        // Remove anything that appears more than once
        chars.removeIf(ch -> Collections.frequency(chars, ch) > 1);

        return String.join("", chars);

    }
}

/*
Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */