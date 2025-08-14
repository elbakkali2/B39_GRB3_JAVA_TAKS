package esmira;

public class SwapNumbers {
    public static void main(String[] args) {

        int num1 = 20, num2 = 30;

        num1 = num1 + num2; // num1 = 50
        num2 = num1 - num2; // num2 = 20
        num1 = num1 - num2; // num1 = 30

        System.out.println("After swap:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
/**
 * SWAP NUMBERS
 * Swap 2 numbers without creating a 3rd variable
 */