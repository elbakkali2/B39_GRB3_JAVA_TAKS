package victorbenitez;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
        System.out.println(removeDup("aabccd"));
        System.out.println(removeDup("Hello World!"));
    }
    public static String removeDup(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.toString().contains(String.valueOf(ch))) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

/*
Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */