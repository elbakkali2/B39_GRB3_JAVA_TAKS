package woodson;

public class Week2_Finra {
    public static void main(String[] args) {
        System.out.println("Starting my FINRA task");
        printFinra();
        System.out.println();
        System.out.println("FINRA task completed");
    }
    public static void printFinra(){
        for (int i = 1; i <= 30; i++) {
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


}

