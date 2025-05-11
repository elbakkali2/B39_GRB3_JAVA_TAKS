package Maryna;

public class SwapNumbers {

    public static void main(String[] args) {
        swapNumbers(5,10);
    }


    public static void swapNumbers(int a, int b) {
        System.out.println("numbers before swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("numbers after swap: a = " + a + ", b = " + b);
    }

}
