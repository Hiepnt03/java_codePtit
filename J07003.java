import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class J07003 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String number = sc.next();
        while (number.length() > 1) {
            int n = number.length();
            BigInteger tmp1 = new BigInteger(number.substring(0,(int) n/2));
            BigInteger tmp2 = new BigInteger(number.substring((int)n/2));
            System.out.println(tmp1.add(tmp2));
            number = tmp1.add(tmp2).toString();
        }
    }
}