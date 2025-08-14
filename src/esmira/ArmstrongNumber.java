package esmira;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println(isArmstrong(123));  // false
        System.out.println(isArmstrong(153));  // true
        System.out.println(isArmstrong(9474)); // true
    }

    public static boolean isArmstrong(int num) {
        String str = String.valueOf(num);
        int power = str.length(); // total digits
        int sum = 0;

        for (char c : str.toCharArray()) {
            int digit = c - '0';
            sum += Math.pow(digit, power);
        }

        return sum == num;
    }
}
/**
 *  Write a method that can check if a number is an
 * Armstrong number.
 */
