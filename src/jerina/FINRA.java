package jerina;

public class FINRA {
    public static void main(String[] args) {
        PrintFINRA();

    }

    public static void PrintFINRA() {
        for (int num = 1; num <= 30; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print("FINRA ");
            } else if (num % 3 == 0) {
                System.out.print("FIN ");
            } else if (num % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(num + " ");
            }
        }
    }
}
