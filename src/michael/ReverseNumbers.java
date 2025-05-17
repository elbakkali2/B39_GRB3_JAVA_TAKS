package michael;

public class ReverseNumbers {
    public static void main(String[] args) {
        System.out.println(reverseNegative(-125));

    }
    public static int reverseNegative(int num) {
      if(num < 0) {

            String numStr = String.valueOf(num);
            String digitsOnly = numStr.substring(1);

            StringBuilder sb = new StringBuilder(digitsOnly);
            sb.reverse();

            return Integer.parseInt("-" + sb.toString());
        }
        return num;

}
