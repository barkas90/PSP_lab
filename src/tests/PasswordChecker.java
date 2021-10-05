package tests;

public class PasswordChecker {
    private int MinPasswordLength = 10;
    private String SpecialChar = "~!$%^&*_=+}{'?-.";
        public boolean isOfCorrectLength(String password) {
        return password.trim().length() >= MinPasswordLength;
    }

    public boolean containsUppercaseSymbols(String password) {
            char letter;
        for (int i = 0; i < password.length();i++){
            letter = password.charAt(i);
            if (Character.isUpperCase(letter)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsSpecialSymbols(String password) {
        char letter;
            for (int i = 0; i < password.length();i++){
                letter = password.charAt(i);
            if (SpecialChar.contains(String.valueOf(letter))) {
                return true;
            }
        }
        return false;
    }
}
