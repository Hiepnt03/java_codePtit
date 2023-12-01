import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class PhepToanCoBan {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(new File("DAYSO.in"));
            int n = sc.nextInt();
            BigInteger ans_max = null;
            BigInteger ans_min = null;
            BigInteger ans_sum = BigInteger.ZERO;
            for(int i=0; i<n; i++){
                BigInteger num = new BigInteger(sc.next());
                if(ans_min == null || num.compareTo(ans_min) < 0)
                    ans_min = num;
                if(ans_max == null || num.compareTo(ans_max) > 0)
                    ans_max = num;
                ans_sum = ans_sum.add(num);
            }
            sc.close();
            System.out.println(ans_min);
            System.out.println(ans_max);
            System.out.println(ans_sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
