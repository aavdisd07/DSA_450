package RSL_Questions;

public class SumOfDigits {
    static int sumOfN(int n) {
        if (n < 10) {
            return n;
        }
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n /= 10;
        }
        return sumOfN(sum);
    }

    public static void main(String[] args) {
        int n = 195;
        System.out.println(sumOfN(n));
    }
}
