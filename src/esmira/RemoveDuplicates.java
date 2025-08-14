package esmira;

import java.util.*;

import static jerina.RemoveDuplicates.removeDup;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAABBBCCC";
        String result = removeDup(str);
        System.out.println(result); // Output: ABC
    }

    public static String removeDup(String str) {
        Set<Character> set = new LinkedHashSet<>(); // keeps order

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }

        return sb.toString();

    }
}
    /*
     ArrayList<Character> chars = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));

        chars.removeIf(p -> Character.isLetter(p));

        System.out.println(chars);
     */



/**
Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
 */

/*
List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        System.out.println(list);


Set<Integer> set = new TreeSet<>();
        set.addAll(list);
        System.out.println(set);

 */

