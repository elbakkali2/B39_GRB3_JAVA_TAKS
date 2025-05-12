package Aisha;

public class SwapTwoNumbers {

    //SWAP NUMBERS
    //Swap 2 numbers without creating a 3rd variable

    public static void main(String[] args) {
      int a=4;
      int b=10;

        System.out.println("Before swapping :a= " + a + " ,b= " +b);
        swapTwoNumber(a,b);



    }


    public static void swapTwoNumber(int a,int b){

        System.out.println("Swapping two number : " );

        //Swap numbers
        a=a + b ;
        b=a-b;
        a=a-b;

        System.out.println("After swapping : a= " + a + " , b= " +b);
    }
}
