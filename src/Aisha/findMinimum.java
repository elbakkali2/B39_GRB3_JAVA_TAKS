package Aisha;

import java.sql.SQLOutput;

public class findMinimum {


//    Array -- Find Minimum
//    Write a method that can find the minimum
//    number from an int Array


    public static int findMinimum1(int[] num) {

        if(num==null ||num.length==0){
            System.err.println("Int Array is null or empty ");
            return Integer.MAX_VALUE ;
        }

        int min=num[0];//assume the first num is the minimum number


        for (int i = 0; i < num.length; i++) {

            if(num[i]<min){
                num[i]=min;//update min
            }


        }

      //  System.out.println("The minimum number is " + min);
        return min;

    }

    public static void main(String[] args) {

     int[] numbers={1,2,3,4,-6,8,9};
        System.out.println("The minimum number is : "  +findMinimum1(numbers) );

    }

}