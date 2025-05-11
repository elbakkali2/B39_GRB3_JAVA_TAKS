package woodson;

public class week3Swap2Numbers {


        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;

            System.out.println("--- Before Swapping ---");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
            // Check if the numbers are equal
            int[] swappedValues = swapTwoNumbers(num1, num2);

            num1 = swappedValues[0];
            num2 = swappedValues[1];

            System.out.println("--- After Swapping ---");
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }

        public static int[] swapTwoNumbers(int a, int b) {
            // Check if the numbers are equal
            if (a == b) {
                System.out.println("Both numbers are equal. No swap needed.");
            }

            a = a + b; // num1 now holds the sum of both numbers (30)
            b = a - b; // num2 now holds the original value of num1 (30 - 20 = 10)
            a = a - b;
            int[] result = {a, b};
            return result;
        }
    }

