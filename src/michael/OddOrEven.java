package michael;

public class OddOrEven {
    public static void main(String[] args) {

        /*
        This is RIGHT OddOrEven class!!!
        This is RIGHT OddOrEven class!!!
        This is RIGHT OddOrEven class!!!
         */
        oddOrEven(8);

        oddOrEven(0);

        oddOrEven(-5);
    }


    public static void oddOrEven(int number) {

        if (number == 0) {
            System.out.println(number + " is an even number, but zero is a special number.");
        } else if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
