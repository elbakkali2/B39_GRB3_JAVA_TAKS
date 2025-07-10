package jerina;
/*
Java Password Validation Task
1. Write a return method that can verify if a password is valid or not. requirements:
 1. Password MUST be at least have 6 characters and should not contain space
 2. PassWord should at least contain one upper case letter
 3. PassWord should at least contain one lowercase letter
 4. Password should at least contain one special characters
 5. Password should at least contain a digit if all requirements above are met,
    the method returns true, otherwise returns false
 */

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();

        if (IsValidPassword(inputPassword)) {
            System.out.println(" Your Password is valid!");
        } else {
            System.out.println(" Your Password is invalid!");
        }

        scanner.close();
    }


    public static boolean IsValidPassword(String password) {


        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
          for (char ch : password.toCharArray())
          { if (Character.isUpperCase(ch)) hasUpper = true;
              else if (Character.isLowerCase(ch)) hasLower = true;
              else if (Character.isDigit(ch)) hasDigit = true;
              else hasSpecial = true;   }
          return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}