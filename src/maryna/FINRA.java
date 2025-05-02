package maryna;

public class FINRA {

    public static void main(String[] args) {


        finraPrinter(15);
        finraPrinter(3);
        finraPrinter(20);
        finraPrinter(-16);
        finraPrinter(0);

    }

    public static void finraPrinter ( int num ) {
        if (num <= 0) {
            System.out.println(num + " - invalid number");
        } else if ( num % 3 == 0 && num % 5 == 0 ) {
            System.out.println("FINRA");
        } else if ( num % 3 == 0  ) {
            System.out.println("FIN");
        } else {
            System.out.println("RA");
        }
    }

}



/*

FINRA :
Write a method which prints out the numbers from 1 to 30 but if the
number is a multiple of 3, print "FIN" instead of the number and if
 the number is multiple of 5, print "RA" instead of the number.
If the number is a multiple of both 3 and 5,
then print "FINRA" instead of the number.

Example:
1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA ...

 */