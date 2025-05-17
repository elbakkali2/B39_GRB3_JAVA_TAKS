package michael;

public class ReverseNumbers {
    public static void main(String[] args) {
        int num = -125;
        System.out.println(reverseNegative(-453));

                /*
             Number -- Reverse negative number
             Write a return method that can reverse negative number and return it as int
             Sample: number= -125
             result= -521
                 */

        String numStr = String.valueOf(num);
        String digitsOnly = numStr.substring(1);

        StringBuilder sb = new StringBuilder(digitsOnly);
        sb.reverse();
        int result = Integer.parseInt("-" + sb.toString());
        System.out.println(result);

        /*String digitsOnly2 = numStr.substring(1);
        String reverse = "";
        for (int i = digitsOnly2.length() - 1; i >= 0; i--) {
            reverse += digitsOnly2.charAt(i);
        }
        int reverseNum = Integer.parseInt("-" + reverse);
        System.out.println(reverseNum);*/
    }
    public static int reverseNegative(int num) {
        String numStr = String.valueOf(num);
        String digitsOnly = numStr.substring(1);

        StringBuilder sb = new StringBuilder(digitsOnly);
        sb.reverse();

        return Integer.parseInt("-" + sb.toString());
    }

}
