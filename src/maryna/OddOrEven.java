package maryna;

public class OddOrEven {

    public static void main(String[] args) {

        oddOrEven(1);
        oddOrEven(10);
        oddOrEven(-10);
        oddOrEven(0);

    }


    public static void oddOrEven (int num) {
        if ( num == 0 ) {
            System.out.println(num + " is an even number, bu zero is a special character.");
        } else if ( num % 2 == 0 ) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }

}
