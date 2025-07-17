package Aisha;

import java.util.Arrays;

public class ArraySortingBuiltInMethod {


    public static void main(String[] args) {



        int[]arr={10, 9, 8, 7};

        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        for (int num:arr){
            System.out.print(num + " ");
        }
    }
}
