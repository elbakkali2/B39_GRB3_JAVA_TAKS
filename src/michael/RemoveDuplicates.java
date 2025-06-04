package michael;

public class RemoveDuplicates {

    /*
    Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
     */

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAACCCDDDSSS"));

    }

    public static String removeDuplicates(String str) {
        String removeDup = "";

        for (char each : str.toCharArray()) {

            if (!removeDup.contains(String.valueOf(each))) {
                removeDup += each;
            }
        }
        return removeDup;
    }

}
