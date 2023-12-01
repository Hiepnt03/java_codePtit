import java.math.BigInteger;
import java.util.Scanner;

public class J03018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String nStr = scanner.nextLine();
            BigInteger n = new BigInteger(nStr);
            BigInteger result = calculateS(n);
            System.out.println(result);
        }
    }

    public static BigInteger calculateS(BigInteger n) {
        // Tính (1^n + 2^n + 3^n + 4^n)
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 4; i++) {
            BigInteger term = BigInteger.valueOf(i).modPow(n, BigInteger.valueOf(5));
            sum = sum.add(term);
        }

        // Lấy modulo 5
        BigInteger mod5 = sum.mod(BigInteger.valueOf(5));

        return mod5;
    }
}
