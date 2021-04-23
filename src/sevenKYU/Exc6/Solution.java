package sevenKYU.Exc6;

public class Solution {
    public static String camelCase(String input) {
        StringBuffer sB = new StringBuffer("");
        String[] letters = input.split("");
        String[] lettersCopy = input.toLowerCase().split("");
        int sum = 0;
        for (int i = 1; i < letters.length; i++) {
            if (letters[i].equals(lettersCopy[i])) {
                sum++;
            }
        }
        String[] finalLetters = new String[letters.length + sum];
        sB.append(letters[0]);
        for (int i = 1; i < letters.length; i++) {
            if (letters[i].equals(lettersCopy[i])) {
                sB.append(letters[i]);
            } else {
                sB.append(" ").append(letters[i]);
            }
        }
        return sB.toString();
    }
}
