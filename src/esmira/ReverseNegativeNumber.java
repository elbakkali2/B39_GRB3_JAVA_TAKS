package esmira;

import java.util.Arrays;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int[] numbers = {-125};
        int[] result = reversArray(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] reversArray(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int num = Math.abs(array[i]); // make positive for reversing
            int rev = 0;

            while (num != 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }

            reversedArray[i] = -rev; // keep negative sign
        }

        return reversedArray;
    }


}
/**
 * Number -- Reverse negative number
 * Write a return method that can reverse negative number and return it as int
 * Sample: number= -125
 *         result= -521
 */