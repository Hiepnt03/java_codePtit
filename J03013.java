import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String a = sc.next();
            String b = sc.next();
            int n = Math.max(a.length(),b.length());
            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(b);
            String result = x.subtract(y).abs().toString();
            int add = n - result.length();
            for (int i = 0; i < add; i++) 
                result = '0' + result;
            System.out.println(result);
            t--;
        }

    }
}
