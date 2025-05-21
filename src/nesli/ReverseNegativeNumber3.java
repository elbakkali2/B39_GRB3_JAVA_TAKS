package nesli;

public class ReverseNegativeNumber3 {

    /**
     * Using Recursion: Reverses the digits of a negative integer using recursion.
     * Technique Used -> Recursive calls
     * Reverses a number recursively by extracting the last digit and building the reversed number step by step.
     * This approach uses a helper function to accumulate the reversed number recursively.
     * Only accepts negative numbers; throws IllegalArgumentException for zero or positive input.
     * Example: input -123 returns -321.
     * @param number the negative integer to reverse
     * @return the reversed digits as a negative integer
     * @throws IllegalArgumentException if the input is zero or positive
     */
    public static int reverseNegativeNumberRecursive(int number) {
        // throws an exception if the nnumber entered is not negative:
        if (number >= 0) {
            throw new IllegalArgumentException("Only negative numbers are accepted.");
        }
        // calls the recursive helper method with the absolute value of the int number.
        // The second argument (0) is the initial value for the "reversed number accumulator" -> initially must be zero and then is going to accumulate.
        int reversed = reverseRecursiveHelper(Math.abs(number), 0);
        return -reversed; // returns the reversed number as negative (since the input was negative)
    }

    /**
     * Helper method to recursively reverse the digits of a number
     * @param number The portion of the number left to process
     * @param result The reversed number accumulated so far ("reversed number accumulator" which was zero initially)
     * @return "int result" The fully reversed number when "int number" becomes 0.
     */
    private static int reverseRecursiveHelper(int number, int result) {
        if (number == 0) return result; // if there are no more digits left (int numner = 0), return the accumulated result (int result).
        return reverseRecursiveHelper(number / 10, result * 10 + number % 10);
        // Recursive step:
        // - Extract the last digit (number % 10).
        // - Shift the current result left by one digit (result * 10).
        // - Add the extracted digit to the result.
        // - Remove the last digit from the number (number / 10).
        // - Continue recursion with the updated values.
    }

    /*
    NOTE TO SELF:

    The recursive reversal process works as follows:

        Extract the Last Digit:

            In each recursive call, the function gets the last digit of the number using the modulus operator (number % 10).

        Build the Reversed Number:

            The helper function maintains an accumulator (result) that represents the reversed number built so far.
            At each step, the last digit is added to the accumulator after shifting its digits left by multiplying by 10 (result * 10 + number % 10).

        Recursive Call:

            The function then removes the last digit from the number using integer division (number / 10) and calls itself recursively with the remaining number and the updated accumulator.

        Base Case:

            When the number becomes 0, the recursion stops, and the accumulator contains the fully reversed number, which is then returned.

     EXECUTION ORDER OF RECURSIVE METHOD for return reverseRecursiveHelper(number / 10, result * 10 + number % 10);

            Java Language Specification Reference
            According to the Java Language Specification, §15.12.4.2:

            "The argument expressions (if any) are evaluated in order, from left to right."

     */

}
