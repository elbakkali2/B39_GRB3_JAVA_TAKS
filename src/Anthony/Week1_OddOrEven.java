package Anthony;

public class Week1_OddOrEven {

    public static void main(String[] args) {

        oddOrEven(2);
        oddOrEven(3);
        oddOrEven(0);

    }

    public static void oddOrEven(int num) {


        if (num == 0) {
            System.out.println("number is zero");
        }else if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");

        }

    }
}