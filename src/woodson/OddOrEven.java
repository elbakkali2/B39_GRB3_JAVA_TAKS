package woodson;

public class OddOrEven {
    public static void main(String[] args) {
        oddOrEven(5);


    }


    public static void oddOrEven(int number ) {



        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

}

