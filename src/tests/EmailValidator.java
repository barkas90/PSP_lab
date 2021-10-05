package tests;

public class EmailValidator {
    String invalidSymbols = "¡¢£¤€";
    public boolean containsRequiredSymbol(String email) {
        return email.contains("@");
    }

    public boolean isOfValidSymbols(String email) {
        char letter;
        for (int i = 0; i < email.length();i++) {
        letter = email.charAt(i);
            for (int j = 0; j < invalidSymbols.length();j++){
                char invalidLetter = invalidSymbols.charAt(j);
                if(letter == invalidLetter)
                    return false;
            }
        }
        return true;
    }

    public boolean isCorrectDomain(String email) {
        String[] domainName = email.split("@");
            if(domainName.length == 2  && domainName[1].length() >= 1){
                return true;
            }
        return false;
    }
}
