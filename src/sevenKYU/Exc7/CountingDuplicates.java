package sevenKYU.Exc7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String[] letters = text.toLowerCase().split("");
        Set<String> lettersSet = new HashSet<>(Arrays.asList(letters));
        int sum = 0;
        for (String set:lettersSet) {
            int duplicate = 0;
            for (String letter:letters) {
                if (set.equals(letter)) {
                    duplicate++;
                }
            }
            if (duplicate>1) {
                sum++;
            }

        }
        return sum;
    }
}
