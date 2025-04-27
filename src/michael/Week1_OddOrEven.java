package michael;

public class Week1_OddOrEven {
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(52);

    }

    public static void oddOrEven(int num){

        if (num%2==0){
            System.out.println(num + " is Even.");
        } else if (num%2==1){
            System.out.println(num + " is Odd.");
        }else {
            System.out.println(num + " is Zero.");
        }
    }
}
