package Aisha;

public class ArraySortAscending {

    public static void main(String[] args) {

//        10.    Array -- Sort Ascending
//        Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//        Ex:
//        int[] arr = {10, 9, 8, 7};
//        arr = Sort(arr);         ==>{ 7, 8, 9, 10};

        int[]arr={10, 9, 8, 7};
        arr=sortArrayAscending(arr);

        System.out.println("Sorted Array : ");

        for(int num:arr){
            System.out.print(num +" " );
        }

    }

    public static int [] sortArrayAscending( int[]arr){




        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                  int temp = arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
               }

            }
            

        }

       return arr;


    }


}
