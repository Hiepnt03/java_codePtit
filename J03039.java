import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            t--;
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            String d1 = a.mod(b).toString();
            String d2 = b.mod(a).toString();
            if ( d1 == "0" || d2 == "0")
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
