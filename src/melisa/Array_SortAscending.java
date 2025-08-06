package melisa;

import java.util.Arrays;

public class Array_SortAscending {

    public static int[] sortAscending(int[] arr) {
        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
        arr = sortAscending(arr);


        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
