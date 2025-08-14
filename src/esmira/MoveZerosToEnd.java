package esmira;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {1,0,2,0,3,0,4,0};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                int j = i;
                while(j < arr.length-1){
                    arr[j] = arr[j+1];
                    j++;
                }
                arr[j] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
/**
 * Array -- Move Zeros to the End
 * Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
 * Ex:
 * input:  {1,0,2,0,3,0,4,0};
 * output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
