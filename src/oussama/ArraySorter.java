package oussama;

public class ArraySorter {
    /*
        10.    Array -- Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */
    public static int[] Sort(int[] array) {
        // Bubble Sort algorithm to sort the array in ascending order
        int n = array.length;

        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // If the element is greater than the next element, swap them
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;  // Return the sorted array
    }

    public static void main(String[] args) {
        // Test the sorting method
        int[] arr = {10, 9, 8, 7};
        arr = Sort(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");  // Output: 7 8 9 10
        }
    }

    /*
    Explanation of the Code:
Outer Loop:

The outer loop (for (int i = 0; i < n - 1; i++)) ensures that we make enough passes through the array to completely sort it.

On each pass, the largest unsorted element "bubbles" up to its correct position in the array.

Inner Loop:

The inner loop (for (int j = 0; j < n - i - 1; j++)) compares each adjacent pair of elements in the array and swaps them if they are in the wrong order.

array[j] > array[j + 1]: If the current element is greater than the next one, we swap them to put the larger element to the right.

Swap:

Swapping is done using a temporary variable (temp), so that the current and next elements can be exchanged.

Return Sorted Array:

After the loops finish, the array is sorted in ascending order, and we return the sorted array.

Example:
For the input array {10, 9, 8, 7}, the program will:

First pass: Compare adjacent elements and swap them:

{10, 9} → swap → {9, 10}

{10, 8} → swap → {9, 8, 10}

{10, 7} → swap → {9, 8, 7, 10}

Second pass: Repeat the process for the remaining elements:

{9, 8} → swap → {8, 9, 7, 10}

{9, 7} → swap → {8, 7, 9, 10}

Third pass: {8, 7} → swap → {7, 8, 9, 10}

After these passes, the array is sorted in ascending order.

Final Output:
Input: {10, 9, 8, 7}

Output: {7, 8, 9, 10}

Time Complexity:
The time complexity of Bubble Sort is O(n²), where n is the number of elements in the array. This is because we have two nested loops: the outer loop runs n - 1 times, and the inner loop runs n - i - 1 times for each pass.

While Bubble Sort is not the most efficient sorting algorithm for large arrays, it is simple and works well for small arrays or educational purposes.    */
}
