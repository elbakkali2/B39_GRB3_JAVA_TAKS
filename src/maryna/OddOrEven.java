package maryna;

public class OddOrEven {

    public static void main(String[] args) {
        evenOrOdd(1);
        evenOrOdd(2);
        evenOrOdd(0);

    }

    public static void evenOrOdd(int num) {
        if(num==0) {
            System.out.println(num + " is an even number, but zero is a special number.");
        }else if (num % 2 == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");

        }
    }
}



