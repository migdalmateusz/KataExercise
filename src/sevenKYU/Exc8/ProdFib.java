package sevenKYU.Exc8;

public class ProdFib {

    public static long[] productFib(long prod) {

        long a = 0;
        long b = 1;

        return fibCheck(a, b, prod);

    }

    public static long[] fibCheck(long a, long b, long prod) {
        if (a*b == prod) {
            return new long[]{a, b, 1};
        } else if (a * b > prod){
            return new long[]{a, b, 0};
        } else {
            return fibCheck(b, a+b,  prod);
        }
    }
}
