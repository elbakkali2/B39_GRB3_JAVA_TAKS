package jerina;


//Write a method that can check if a number is an Armstrong number.

public class IsArmstrongNum {
    public static void main(String[] args) {

        System.out.println("isArmstrongNum(132) = " + isArmstrongNum(132));
        System.out.println("isArmstrongNum(153) = " + isArmstrongNum(153));
        System.out.println("isArmstrongNum(9474) = " + isArmstrongNum(9474));
        System.out.println("isArmstrongNum(99) = " + isArmstrongNum(9));

    }

    public static boolean isArmstrongNum(int n) {
        String strNum = "" + n;
        int nLength = strNum.length();
        int sum = 0;

        for (int i = 0; i < strNum.length(); i++) {
            int eachDigit = Integer.parseInt(strNum.substring(i, i + 1));
            sum += (int) Math.pow(eachDigit, nLength); // each digit ^ pow
            System.out.println("sum = " + sum);
        }
        return sum == n;
    }
    }
