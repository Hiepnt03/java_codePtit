import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
        System.out.println(x.subtract(y));
    }
}
