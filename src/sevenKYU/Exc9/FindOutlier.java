package sevenKYU.Exc9;

public class FindOutlier {
    public static int find(int[] integers) {
        int number=0;
        int sumOdd = 0;
        int sumEven = 0;
        for (int integer : integers) {
            if (integer % 2 == 0) {
                sumEven++;
            } else {
                sumOdd++;
            }
        }
        if (sumEven > sumOdd) {
            for (int integer : integers) {
                if (integer % 2 != 0) {
                    number = integer;
                }
            }
        } else {
            for (int integer : integers) {
                if (integer % 2 == 0) {
                    number = integer;
                }
            }
        }
        return number;
    }
}

