package melisa;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int number = -125;
        int result = reverseNegative(number);
        System.out.println("Reversed = " + result);


    }

    public static int reverseNegative(int number){
        String convertStr = Integer.toString(number).substring(1);

        String reversedStr = new StringBuilder(convertStr).reverse().toString();

        return Integer.parseInt("-" + reversedStr);

    }

}
