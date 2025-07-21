package oussama;

public class ArrayMinFinder {
    /*Array -- Find Minimum
    Write a method that can find the minimum
    number from an int Array
     */
    public static int findMinimum(int[] array) {
        // If the array is empty, we can return an error or throw an exception
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Assume the first element is the minimum
        int min = array[0];

        // Loop through the array to find the smallest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];  // Update min if a smaller number is found
            }
        }

        return min;  // Return the minimum value found
    }

    public static void main(String[] args) {
        // Test the method with an example array
        int[] numbers = {34, 78, 12, 56, 5, 89, 1};
        int min = findMinimum(numbers);
        System.out.println("The minimum number is: " + min);  // Output: 1
    }

    /*
    Explanation:
Initial Check for Empty Array:

If the array is null or empty, we throw an exception (IllegalArgumentException). This prevents the method from breaking or returning incorrect values when the input is invalid.

Assume the First Element as Minimum:

We start by assuming the first element of the array (array[0]) is the smallest (min).

Loop Through the Array:

We loop through the rest of the elements in the array (starting from index 1).

For each element, if it's smaller than the current min, we update min to that element.

Return the Minimum Value:

After looping through all the elements, the min variable will hold the smallest value in the array, which is then returned.

Example:
For the input array {34, 78, 12, 56, 5, 89, 1}, the program will:

Start by assuming min = 34.

Compare each subsequent element:

78 is greater than 34, so no change.

12 is smaller than 34, so update min to 12.

56 is greater than 12, so no change.

5 is smaller than 12, so update min to 5.

89 is greater than 5, so no change.

1 is smaller than 5, so update min to 1.

Finally, the method returns 1 as the minimum value.

Edge Cases to Consider:
Empty Array: We handle this by throwing an exception.

Array with One Element: If the array only has one element, that element is both the minimum and the maximum.

All Elements Same: If all elements in the array are the same, the minimum will still be that value.     */
}

