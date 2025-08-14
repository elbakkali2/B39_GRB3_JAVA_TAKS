package esmira;

public class PasswordValidation {

    public static void main(String[] args) {

        String password = "<Password-123>";

        if (password.length() >= 8 && password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*")) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}

/**
String -- Password Validation Task
 * Write a return method that can verify if a password is valid or not.
Requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

If all requirements above are met, the method returns true; otherwise it returns false.
 */