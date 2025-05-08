package jerina;

public class SwapNumbers {
    public static void main(String[] args) {
        swapNumbers(4,3);

    }
    public static void swapNumbers(int a, int b) {
        System.out.println("The value of a and b before swap : " +"a = " + a +"; "+ "b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The value of a and b after swap : " +"a = " + a +"; "+ "b = " + b);
    }
}
