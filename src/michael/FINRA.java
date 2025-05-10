package michael;

public class FINRA {
    public static void main(String[] args) {

        PrintFINRA();
        PrintFINRA2(1,50);
    }
    public static void PrintFINRA () {

        for (int num = 1; num <= 30; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print("FINRA ");
            } else if (num % 3 == 0) {
                System.out.print("FIN ");
            } else if (num % 5 == 0) {
                System.out.print("RA ");
            }else{
                System.out.print(num + " ");
            }
        }
    }

    public static void PrintFINRA2(int start, int end) {
        System.out.println("");
        while(start < end){
            if(start % 3 == 0 && start % 5 == 0) {
                System.out.print("FINRA ");
            }else if (start % 3 == 0) {
                System.out.print("FIN ");
            }else if (start % 5 == 0) {
                System.out.print("RA ");
            }else{
                System.out.print(" " + start + " ");
            }
            start++;

        }

    }
}
