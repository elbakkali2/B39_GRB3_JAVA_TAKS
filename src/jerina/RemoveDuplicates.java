package jerina;


public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
        System.out.println(removeDup("CUCUMBER"));
        System.out.println(removeDup("Hello classmates"));

    }

    public static String removeDup(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!result.toString().contains("" + str.charAt(i)))
                result.append(str.charAt(i));
        }
        return result.toString();
    }
}
