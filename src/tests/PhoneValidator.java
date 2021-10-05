package tests;

public class PhoneValidator {
    public boolean containsOnlyDigits(String number) {
        char numb;
        for (int i = 0; i < number.length(); i++) {
            numb = number.charAt(i);
            if(!Character.isDigit(numb))
                return false;
        }
        return true;
    }

    public boolean isValidForCountry(String prefix, String number) {

        return number.substring(0, prefix.length()).equals(prefix);
    }
    public String addCountryPrefix(String number) {
        if(number.toCharArray()[0] == '8')
        {
            return "+370" + number.substring(1);
        }
        return number;
    }
}
