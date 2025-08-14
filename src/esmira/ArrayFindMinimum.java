package esmira;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFindMinimum {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int min = nums.get(0);

        for(int each : nums ){

            if(each < min){
                min = each;
            }
        }

        System.out.println("Minimum number is " + min);


    }
}
/**
 * Array -- Find Minimum
 * Write a method that can find the minimum
 * number from an int Array
 */
