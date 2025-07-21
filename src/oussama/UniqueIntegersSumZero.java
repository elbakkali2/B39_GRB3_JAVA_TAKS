package oussama;
import java.util.ArrayList;
import java.util.List;

public class UniqueIntegersSumZero {
/* 11. Array -- N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).     */

        public static int[] generateIntegers(int N) {
            // List to hold the result
            List<Integer> result = new ArrayList<>();

            // If N is odd, we can add a 0 in the middle
            if (N % 2 != 0) {
                result.add(0); // Add 0 to the list if N is odd
                N--;  // Decrease N by 1, as we already added 0
            }

            // Create pairs of numbers that sum to 0
            for (int i = 1; i <= N / 2; i++) {
                result.add(i);    // Add positive number
                result.add(-i);   // Add corresponding negative number
            }

            // Convert the List to an int array
            int[] resultArray = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                resultArray[i] = result.get(i);
            }

            return resultArray;
        }

        public static void main(String[] args) {
            // Example usage
            int N = 5;  // Test with odd N
            int[] result = generateIntegers(N);

            // Print the result
            System.out.print("Generated integers: ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }

        /* Explanation of the Code:
Check for Odd N:

If N is odd, we add a 0 to the result list to balance out the sum. We then decrement N by 1 to handle the even case of generating pairs.

Generate Pairs:

We loop through numbers from 1 to N / 2 to generate pairs:

Add i (positive number).

Add -i (corresponding negative number).

These pairs will always sum to zero.

Convert List to Array:

After constructing the list of integers, we convert it to an array and return the result.

Main Method:

In the main method, I use an example where N = 5 to test the function and print the generated integers.

Example Outputs:
For different values of N, the possible outputs could be:

N = 4:

Example: [1, -1, 2, -2]

N = 5 (odd):

Example: [0, 1, -1, 2, -2]

N = 6:

Example: [1, -1, 2, -2, 3, -3]

Edge Cases:
Minimum Value for N: The function is designed for 1 < N < 100, so N will always be at least 2.

Negative and Positive Pairs: We ensure that all numbers are unique and the sum is always zero.        */
    }



