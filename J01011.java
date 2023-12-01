import java.math.BigInteger;
import java.util.Scanner;
public class J01011 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            String number_1 = sc.next();
            String number_2 = sc.next();
            BigInteger a = new BigInteger(number_1);
            BigInteger b = new BigInteger(number_2);
            BigInteger ucln = a.gcd(b);
            BigInteger bcnn = (a.multiply(b)).divide(ucln);
            System.out.printf(bcnn+" "+ucln+"\n");
        }
    }
    
}
