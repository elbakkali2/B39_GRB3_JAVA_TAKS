package oussama;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(ReverseNegativeNum(-125));
        System.out.println(reverseNegativeNumber(-125));

    }

  /*
           Number -- Reverse negative number
        Write a return method that can reverse negative number and return it as int

        Sample: number= -125
                result= -521
          */

    public static int ReverseNegativeNum(int number){

        // if number zero or positive it's will return it
        if (number >= 0) {
            return number;
        }
        // We first convert it to positive: num = -number
        // reversed = 0 initially.
        int reversed = 0;

        // Iteration	num	         num % 10 (digit)	        reversed = reversed * 10 + digit
        //1         	123	              3	                             0 * 10 + 3 = 3
        //2	             12	               2	                         3 * 10 + 2 = 32
        //3	              1	               1	                         32 * 10 + 1 = 321
        //4	              0	                —                           	loop ends
        for (int num = -number; num > 0; num /= 10) {
            reversed = reversed * 10 + num % 10;
        }

        //Then return -reversed, which gives -number.
        return -reversed;
    }

    public static int reverseNegativeNumber(int number) {
        if (number >= 0) {
            return number;
        }

        int num = -number;
        int reversed = 0;

        do {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        } while (num > 0);

        return -reversed;
    }


}
