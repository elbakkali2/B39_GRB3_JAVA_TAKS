package Aisha;

public class StringValidationTask {


//    String -- Password Validation Task
//1. Write a return method that can verify if a password is valid or not.
//    requirements:
//            1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//
//if all requirements above are met, the method returns true, otherwise returns  false

    public static boolean passWordValidate(String str) {

        if (str.length() < 6 || str.contains(" ")) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialCharacters = false;
        boolean hasDigit = false;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {     // if it's NOT a letter or digit, then it's a special character
                hasSpecialCharacters = true;
            }

        }
            return hasLowerCase && hasUpperCase && hasDigit && hasSpecialCharacters;


        }

        public static void main (String[]args){

            String testPassword = "area90";
            System.out.println("passWordValidate(testPassword) = " + passWordValidate(testPassword));
        }

    }

