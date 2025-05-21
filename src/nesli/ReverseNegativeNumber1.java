package nesli;

import java.util.Scanner;

public class ReverseNegativeNumber1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a negative integer to reverse: "); // prompts the user for input
        double number = scanner.nextDouble(); // reads the user input by scanner.nextIDouble() as a double; and assigns it to the variable double number
        //Using double allows the program to accept integer and floating-point inputs (int, long, float, or double values)
        //Using double allows for a wider range of numeric input.

        int result = reverseNegativeNumber(number); // calls reverseNegativeNumber(number) method and assigns its output to the variable result
        System.out.println("Reversed number: " + result); // prints the variable result
    }

    /**
     * Reverses the digits of a negative number and returns the result as an integer.
     *
     * @param number a negative Number (e.g., Integer, Double, Long, etc.)
     * @return the reversed digits as a negative integer
     * @throws IllegalArgumentException if the input is zero or positive
     */
    public static int reverseNegativeNumber(Number number) { // accepts all the numbers (READ NOTE TO SELF)
        long value = number.longValue(); // converts the input Number number to a long value to handle Integer, Long, Double, etc.
        if (value >= 0) { // checks if the number is zero or positive; if so, throws an exception
            throw new IllegalArgumentException("Only negative numbers are accepted.");
        }
        value = Math.abs(value); // converts the number stored in "long value" to its absolute value to reverse digits easily
        int reversed = 0; // to store the reversed number
        while (value > 0) {  // loops through each digit of the number
            int digit = (int) (value % 10); // to get the last digit of the current "long value", divides it to 10 and assigns the remainder as an integer to the variable int digit
            reversed = reversed * 10 + digit;
            value /= 10; // removes the last digit from value (and discards any fractional part from the division result -> integer division in Java)
        }
        return -reversed; // returns the reversed number as negative (since input was negative)
    }

    /*
    NOTE TO SELF:

    Defining the argument as Number allows the method to accept any numeric wrapper class in Java, such as Integer, Long, Double, Float, and Short,
    instead of being limited to just one type like int. All these classes are subclasses of the abstract class Number,
    which provides methods to convert their values to different primitive types (e.g., intValue(), longValue(), doubleValue()).
    Using Number as the parameter type makes the method more flexible and reusable, as it can handle different numeric types without
    needing separate overloads for each one. For example, we can pass an Integer, Double, or Long to the same method, and it will work with all of them.
    This is not possible with primitive types like int, because primitives are not objects and do not inherit from Number.
    Defining the argument as Number enables the method to accept a broader range of numeric input types,
    increasing its versatility and compatibility with Java’s numeric wrapper classes.

    EXPLANATION FOR int digit = (int) (value % 10);

        Since value is of type long, computing the remainder by "value % 10" (value is divided by 10) results in a long type.
        (int) (value % 10) explicitly casts the result from long to int.
        The cast is necessary because digit is declared as an int, and Java does not automatically convert a long to an int without an explicit cast.

    EXPLANATION FOR reversed = reversed * 10 + digit;

        1)Multiplying reversed by 10 shifts all its digits left
        2)Adding digit appends the new digit to the rightmost position.

        reversed * 10 shifts the current number left by one digit.
        + digit adds the new digit at the end.
        Repeating this for each digit reconstructs the original number in reverse order.

        Example:

            Suppose you are reversing the number 123:

            Start:

                reversed = 0
                digit = 3 (last digit of 123)

            First Iteration:

                reversed = 0 * 10 + 3 = 3

            Second Iteration:

                digit = 2 (next digit from right)
                reversed = 3 * 10 + 2 = 32

            Third Iteration:

                digit = 1 (next digit from right)
                reversed = 32 * 10 + 1 = 321

    EXPLANATION FOR value /= 10; -> uses "integer division" to remove the last digit from the number

        Variable "long value" stores whole numbers (no decimals) -> In Java, both int and long are integer types (as opposed to floating-point types like float and double).
        Dividing an integer by 10 shifts all digits to the right by one place, effectively dropping the last digit.
        This happens because "integer division" in Java discards any fractional part -> For example, if value is 123, then 123 / 10 yields 12 -not 12.3- because Java's integer division always truncates (discards) the fractional part of the result

        value /= 10; removes the last digit from the variable value by shifting all digits right and discarding the remainder.
        This is a common technique for digit-by-digit processing of numbers in programming.
     */

}
