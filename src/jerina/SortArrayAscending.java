package jerina;

import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String[] args) {
        System.out.println("Array sorted in ascending order: " + Arrays.toString(sortAscending(3, 5, -6, 19, 10, 29)));
    }

    public static int[] sortAscending(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
