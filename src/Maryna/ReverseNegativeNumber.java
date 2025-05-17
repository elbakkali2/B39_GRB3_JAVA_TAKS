package Maryna;

public class ReverseNegativeNumber {

    public static int reverseNegativeNumber(int num) {
        if (num >= 0) {
            return num;
        }

        String numStr = Integer.toString(-num);
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        int reversedNum = Integer.parseInt(reversedStr);

        return -reversedNum;

    }

    public static void main(String[] args) {

        int num = -125;
        int result = reverseNegativeNumber(num);
        System.out.println("result = " + result);

    }

}
