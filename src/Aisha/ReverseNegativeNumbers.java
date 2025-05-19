package Aisha;

public class ReverseNegativeNumbers {



    //Number -- Reverse negative number
    //Write a return method that can reverse negative number and return it as int
    //
    //Sample: number= -125
    //        result= -521

    public static int reverseNegativeNumber(int number){

        //convert the number to String
      String numStr=Integer.toString(number);
      String reversedString=new StringBuilder(numStr.substring(1)).reverse().toString();
      return Integer.parseInt("-" + reversedString);

    }

    public static void main(String[] args) {
        int number=-125;
        int result=reverseNegativeNumber(number);
        System.out.println("result = " + result);

    }

}
