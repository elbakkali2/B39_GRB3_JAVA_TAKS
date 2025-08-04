package jerina;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        System.out.println("Array with zeros to end : " + Arrays.toString(shiftZerosToEnd(0, 2, 7, 10, 0, 0, 7, 19)));
        System.out.println("Array with zeros to end : " + Arrays.toString(shiftZerosToEnd(1, 0, 2, 0, 3, 0, 4, 0)));

    }

    public static int[] shiftZerosToEnd(int... array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }

        while (index < array.length) {
            array[index++] = 0;
        }
        return array;
    }
}