package Anthony;

public class Week3_SwapValues {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        System.out.println("number 1 has the value of: "+ num1+ " before swap");
        System.out.println("number 2 has the value of: "+num2+ " before swap" );

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("number 1 has the value of: "+num1+ " After swap");
        System.out.println("number 2 has the value of: "+num2+" After swap" );

    }
}
