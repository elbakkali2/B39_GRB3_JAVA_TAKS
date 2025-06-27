package melisa;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("reversed= " + reverse("melisa"));

        System.out.println(reverse("ABCD"));

        System.out.println(reverseBuilder("Hello Friends!"));

    }

    public static String reverse(String str){
        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);

        }

        return reversed;

    }

    public static String reverseBuilder(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
