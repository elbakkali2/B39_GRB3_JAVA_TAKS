package melisa;

public class PasswordValidation {

    public static boolean isValidPassword(String password) {

        // Check if password has at least 6 characters and no spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true; // Any non-letter, non-digit character
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("Abc@12"));
        System.out.println(isValidPassword("abc123"));
        System.out.println(isValidPassword("ABC@12"));
        System.out.println(isValidPassword("A b@12"));
    }
}

