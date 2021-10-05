package tests;

public class NewTests {
    public boolean checkIfValidTLD(String email) {
        int howManyLetters = 0;
        for (int i = email.length(); i > 1 ; i--) {
            char ch = email.charAt(i-1);
            if (ch != '.') {
                howManyLetters++;
            }
            else
                break;
        }
        if(howManyLetters > 1)
            return true;
        else
            return false;
    }
}
