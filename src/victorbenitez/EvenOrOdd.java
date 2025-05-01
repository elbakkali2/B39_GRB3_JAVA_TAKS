package victorbenitez;

public class EvenOrOdd {
    public static void main(String[] args) {

        evenOrOdd(2);
        evenOrOdd(3);
        evenOrOdd(0);
    }

    public static void evenOrOdd(int number) {
        if (number == 0) {
            System.out.println("zero");
        } else if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}