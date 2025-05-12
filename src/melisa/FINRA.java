package melisa;

public class FINRA {

    public static void main(String[] args) {

        finra();
        System.out.println();
        finra(15);

    }

    public static void finra() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }


    public static void finra(int i) {

        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FINRA");
        } else if (i % 5 == 0) {
            System.out.println("RA");
        } else if (i % 3 == 0) {
            System.out.println("FIN");
        }else{
            System.out.print(i + " ");
        }


    }
}