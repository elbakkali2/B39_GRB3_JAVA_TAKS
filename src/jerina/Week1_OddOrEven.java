package jerina;

public class Week1_OddOrEven {
    public static void main(String[] args) {
OddOrEven(4);

    }
    public static void OddOrEven(int num) {

        if(num % 2 == 0) {
            System.out.println("The number "+ num +" is odd");
        } else if  (num % 2 == 1) {
            System.out.println("The number " + num + " is even");
        } else {
            System.out.println("The number " + num + " is zero");
        }

    }
}
