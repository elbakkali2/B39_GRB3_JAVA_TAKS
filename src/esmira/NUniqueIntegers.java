package esmira;

import java.util.Arrays;

public class NUniqueIntegers {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumZero(4))); // [-1, 1, -2, 2]
        System.out.println(Arrays.toString(sumZero(3))); // [-1, 0, 1]
    }

    public static int[] sumZero(int N) {
        int[] result = new int[N];
        int index = 0;

        for (int i = 1; i <= N / 2; i++) {
            result[index++] = -i; // negative
            result[index++] = i;  // positive
        }

        if (N % 2 != 0) {
            result[index] = 0; // add zero if odd
        }

        return result;


    }
}

/**
 * Array -- N unique integers that sum up to 0
 * Write a function:
 * that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
 */
