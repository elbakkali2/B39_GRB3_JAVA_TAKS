package Aisha;

public class ReverseStringWithoutUsingBuiltInMethod {




    public static String REVERSED(String STR){

        String reversed=" ";

        for (int i = STR.length()-1; i >=0 ; i--) {

            reversed+=STR.charAt(i);
        }
        return reversed;

    }

    public static void main(String[] args) {
        System.out.println("REVERSED(\"ABCD\") = " + REVERSED("ABCD"));


    }
}
