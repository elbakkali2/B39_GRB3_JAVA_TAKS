package jerina;

public class MinNumber {

        public static void main(String[] args) {
            int [] x = {7,8,3,-5,1,9,4};
            System.out.println(minValue(x));
        }


        public static int minValue(int[] numbers) {
            if (numbers == null || numbers.length == 0) {
                System.out.println("Array is empty");
                return 0;
            }
            int min = numbers[0];
            for (int number : numbers) {
                if (number < min) {
                    min = number;
                }
            }
            return min;
        }
    }

