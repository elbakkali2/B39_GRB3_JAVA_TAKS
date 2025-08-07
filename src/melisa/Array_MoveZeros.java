package melisa;

public class Array_MoveZeros {

    public static int[] moveZerosToEnd(int[] arr) {
        int index = 0; // Position to place non-zero elements

        // First, move all non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill the rest with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        arr = moveZerosToEnd(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 1 2 3 4 0 0 0 0
    }


}
