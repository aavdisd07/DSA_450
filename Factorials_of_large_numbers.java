
import java.math.BigInteger;
import java.util.ArrayList;

public class Factorials_of_large_numbers {

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        BigInteger ans = BigInteger.ONE;
        int N = 5;
        for (int i = 1; i <= N; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        String a = ans.toString();
        for (char c : a.toCharArray()) {
            result.add(c - '0');
        }
        System.out.println(result);

    }
}
