package melisa;

public class SwapNumbers {
    public static void main(String[] args) {

        swapNumbers(20,40);


    }

    public static void swapNumbers(int num1, int num2) {

        System.out.println("Before swapping the numbers");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping the numbers");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }

}
