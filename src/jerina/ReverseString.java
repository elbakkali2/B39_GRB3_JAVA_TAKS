package jerina;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
        System.out.println(reverseString("CYDEO FRIENDS").toLowerCase());
        System.out.println(reverseString("batch39").toUpperCase());

    }
    public static String reverseString(String input) {
        String output = "";
        for (int i = input.length()-1;i>=0;i--) {
            output += input.charAt(i);
        }
        return output;
    }
}
