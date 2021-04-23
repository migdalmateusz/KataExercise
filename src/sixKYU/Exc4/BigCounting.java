package sixKYU.Exc4;

public class BigCounting {

    public static int countBits(int n) {

        String number = Integer.toBinaryString(n);

        String[] numbers = number.split("");

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("1")) {
                sum = sum + 1;
            }
        }

        return sum;
    }
}
