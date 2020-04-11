package doc;

public class PasswordValidator {

    public static void main(String[] args) {
        boolean validPassword = isValidPassword("Kacper");
        System.out.println(validPassword);
    }

    public static boolean isValidPassword(String password) {
        if (password.length() >= 6 && password.contains("1")) {
            return true;
        } else {
            return false;
        }
    }
}

