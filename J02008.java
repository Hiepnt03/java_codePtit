import java.math.BigInteger;
import java.util.Scanner;

public class J02008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] ans = new String[101];
        ans[1] = "1";
        ans[2] = "2";
        for (int i = 3; i <= 100; i++) {
            BigInteger a = new BigInteger(ans[i-1]);
            BigInteger b = new BigInteger(String.valueOf(i));
            BigInteger ucln = a.gcd(b);
            ans[i] = a.multiply(b).divide(ucln).toString();
        }

        int t = sc.nextInt();
        while (t --> 0){
            int n = sc.nextInt();
            System.out.println(ans[n]);
        }
    }
}
