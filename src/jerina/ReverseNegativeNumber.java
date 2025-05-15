package jerina;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(ReverseInt(-324));
        System.out.println(ReverseInt(-41));
        System.out.println(ReverseInt(-7851122));
        System.out.println(ReverseInt(1005));

    }
    public static int ReverseInt(int n) {
        int rev = 0;
        boolean negative = n < 0;
        n = Math.abs(n);
        while (n > 0) {
            int lastDigit = n % 10;
            if (rev > (Integer.MAX_VALUE - lastDigit) / 10) {
                throw new ArithmeticException("Integer overflow while reversing");
            } else {
                rev = rev * 10 + lastDigit;
            }
            n /= 10;
        }
        return negative? -rev : rev;

    }
}