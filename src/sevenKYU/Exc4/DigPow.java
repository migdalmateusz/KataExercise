package sevenKYU.Exc4;

public class DigPow {

    public static long digPow(int n, int p) {
        String[] number = String.valueOf(n).split("");
        double sum =0;
        long score = 0;
        for (int i =0; i < number.length; i++) {
            sum = sum + Math.pow(Integer.parseInt(number[i]), (p + i));
        }
        double k = sum/n;
        if (k == (int)k) {
            score = (long)k;
        } else {
            score = -1;
        }
        return score;
    }
}
