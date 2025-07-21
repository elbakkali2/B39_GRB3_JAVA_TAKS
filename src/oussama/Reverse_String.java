package oussama;

public class Reverse_String {

    /*  String -- Reverse
        Write a return method that can reverse  String
        Ex: Reverse("ABCD"); ==> DCBA    */

    public static String reverse(String str) {
        // Use StringBuilder to reverse the string
        StringBuilder reversedStr = new StringBuilder(str);
        return reversedStr.reverse().toString();
    }

    public static void main(String[] args) {
        // Test the reverse method
        String original = "ABCD";
        String reversed = reverse(original);
        System.out.println(reversed);  // Output: DCBA

        // second way

        // Test the reverse method
        reversed = reverse2(original);
        System.out.println(reversed);  // Output: DCBA
    }

    /*
    Explanation:
StringBuilder:

StringBuilder is a mutable class in Java that can be modified after it's created.

It has a built-in reverse() method, which reverses the sequence of characters.

reversedStr.reverse():

This method reverses the content of the StringBuilder object, meaning the string "ABCD" becomes "DCBA".

toString():

After reversing, we convert the StringBuilder object back into a String using toString().

Example Execution:
For the input "ABCD", this is what happens:

The string is converted to a StringBuilder object.

The reverse() method reverses the string inside the StringBuilder.

The reversed string "DCBA" is returned.
     */

    public static String reverse2(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);  // Append each character in reverse order
        }
        return reversedStr;

    }

    /*
    Explanation of the Loop Approach:
Looping in reverse: We start from the last character of the string (str.length() - 1) and loop backward to the first character (i >= 0).

str.charAt(i): This retrieves each character in reverse order.

Concatenating: We append each character to the reversedStr string.

Summary:
StringBuilder.reverse() is the most efficient and simple method.

The looping approach works too but is less efficient in Java because strings are immutable (each concatenation creates a new string).
     */



}
