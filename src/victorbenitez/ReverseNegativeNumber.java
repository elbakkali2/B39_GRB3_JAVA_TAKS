package victorbenitez;

public class ReverseNegativeNumber {

    public static int reverseNegative(int number) {
        if (number >= 0) throw new IllegalArgumentException("The number must be negative.");

        String reversed = new StringBuilder(String.valueOf(-number)).reverse().toString();
        return -Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        int number = -125;
        System.out.println("number = " + reverseNegative(number));
    }
}

/*
Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int

Sample: number= -125
        result= -521
 */