package Anthony;

public class Week1_OddOrEven {

    public static void main(String[] args) {

        oddOrEven(2);

    }

    public static void oddOrEven(int num){

        if (num % 2 == 0){
            System.out.println("even");
        } else if (num % 2 == 1) {
            System.out.println("odd");
        }else{
            System.out.println("zero");
        }

    }
}
