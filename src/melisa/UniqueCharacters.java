package melisa;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println("unique(str) = " + unique(str));

    }

    public static String unique(String input){

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (input.indexOf(ch) == input.lastIndexOf(ch)){
                result.append(ch);

            }
        }
        return result.toString();
    }

}
