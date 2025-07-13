package melisa;

public class Array_FindMinimum {

    public static int findMinimum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty !");
        }

        int min = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {5, 8, -5, 3, 1};

        System.out.println("Minimum number: " + findMinimum(arr));

    }

}
