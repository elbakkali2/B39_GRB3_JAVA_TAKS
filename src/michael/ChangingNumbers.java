package michael;

public class ChangingNumbers {
    public static void main(String[] args) {

        System.out.println(changingNumbers(5,31));
        int[] result = changingNumbers2(4, 18);
        //System.out.println(result[0]);
        //System.out.println(result[1]);
        System.out.println("num1 = " + result[0] + ", num2 = " + result[1]);

    }

    public static String changingNumbers(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        return "num1 = " + num1 + ", num2 = " + num2;
    }

    public static int[] changingNumbers2(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        return new int[]{num1, num2};
    }
}
