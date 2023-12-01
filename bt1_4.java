import java.math.BigInteger;
import java.util.Scanner;

public class bt1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        boolean check = false;
        while (t-->0) {
            String number = sc.next();
            BigInteger n = new BigInteger(number);
            int cnt = 1000;
            while (cnt-->0) {
                if(n.mod(new BigInteger("13")) == BigInteger.ZERO){
                    check = true;
                    break;
                }
                else{
                    StringBuilder m = new StringBuilder(number);
                    String m_resever = m.reverse().toString();
                    n = n.add(new BigInteger(m_resever));
                    number = n.toString();
                }
            }
            if(check) System.out.println(number);
            else System.out.println("-1");
        }
    }
}
