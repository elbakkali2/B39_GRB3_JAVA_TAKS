package nesli;

public class ReverseNegativeNumber2 {

    public static void main(String[] args) {
        int[] testNumbers = {-123, -900, -1, 0, 123}; // tests the method with different inputs

        for (int num : testNumbers) {
            try {
                int result = reverseNegativeNumberString(num);
                System.out.printf("Input: %d, Reversed: %d%n", num, result);
            } catch (IllegalArgumentException e) {
                System.out.printf("Input: %d, Exception: %s%n", num, e.getMessage());
            }
        }
    }

    /**
     * Using String Manipulation:
     * Technique Used -> StringBuilder
     * Reverses the digits of a negative integer using String manipulation.
     * Only accepts negative numbers; throws IllegalArgumentException for zero or positive input.
     * Example: input -123 returns -321.
     * @param number the negative integer to reverse
     * @return the reversed digits as a negative integer
     * @throws IllegalArgumentException if the input is zero or positive
     */
    public static int reverseNegativeNumberString(int number) {
        if (number >= 0) {
            throw new IllegalArgumentException("Only negative numbers are accepted.");
        }
        String numStr = Integer.toString(Math.abs(number));
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        int reversed = Integer.parseInt(reversedStr);
        return -reversed;
    }

}
