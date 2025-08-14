package esmira;

public class FINRA {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            boolean by3 = i % 3 == 0;
            boolean by5 = i % 5 == 0;

            String result = "";

            if (by3 && by5) {
                result = "FINRa";
            }else if (by3) {
                result = "FIN";
            }else if (by5) {
                result = "Ra";
            }else  {
                result = "" + i;
            }
            System.out.print(result + " ");

        }
    }
}
/**
 FINRA:
 Write a method which prints out the numbers from 1 to 30 but if the number is a multiple of 3, print "FIN" instead of the number and if the number is multiple of 5, print "RA" instead of the number. If the number is a multiple of both 3 and 5, then print "FINRA" instead of the number.
 Example:
 1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA ...
 */