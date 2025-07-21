package oussama;

public class Password_Validation {

    /*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false  */

    public static boolean isValidPassword(String password) {
        // Check if the password length is at least 6 characters and contains no spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check if the password contains at least one uppercase letter
        boolean hasUppercase = false;
        // Check if the password contains at least one lowercase letter
        boolean hasLowercase = false;
        // Check if the password contains at least one digit
        boolean hasDigit = false;
        // Check if the password contains at least one special character
        boolean hasSpecialChar = false;

        // Loop through each character of the password
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            // Check for uppercase letter
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            // Check for lowercase letter
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }
            // Check for digit
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            // Check for special character
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        // All conditions must be true
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        // Test the password validation
        System.out.println(isValidPassword("Password1!"));  // true
        System.out.println(isValidPassword("password"));    // false
        System.out.println(isValidPassword("1234abcd!"));   // false
        System.out.println(isValidPassword("Pass 1234!"));  // false
    }

    /*
    Explanation:
Password Length & Spaces:

The first if statement checks whether the password is less than 6 characters or contains spaces. If either condition is true, the password is considered invalid, and the method returns false.

Character Checks:

We use the Character class methods to check for specific types of characters:

Uppercase: Character.isUpperCase(c) checks if the character is uppercase.

Lowercase: Character.isLowerCase(c) checks if the character is lowercase.

Digit: Character.isDigit(c) checks if the character is a digit.

Special Character: !Character.isLetterOrDigit(c) checks if the character is neither a letter nor a digit (i.e., a special character).

Final Validation:

We return true only if all the conditions are met:

The password contains at least one uppercase letter.

The password contains at least one lowercase letter.

The password contains at least one digit.

The password contains at least one special character.

Test Cases:

In the main() method, we test the function with a few example passwords to see if the validation works correctly.

Example Test Cases:
Valid Password:

"Password1!" → Returns true because it meets all the conditions.

Invalid Password (missing uppercase letter):

"password" → Returns false because it doesn’t contain an uppercase letter, a digit, or a special character.

Invalid Password (missing special character):

"1234abcd!" → Returns false because it doesn't contain an uppercase letter and digit.

Invalid Password (contains spaces):

"Pass 1234!" → Returns false because it contains a space.
     */
}

