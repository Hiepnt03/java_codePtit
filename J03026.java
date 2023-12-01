import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            t--;
            String s1 = sc.next();
            String s2 = sc.next();
            if ( s1.length() != s2.length() )
                System.out.println(Math.max(s1.length(), s2.length()));
            else
            {
                if( s1.equals(s2) )
                    System.out.println("-1");
                else
                    System.out.println(s1.length());
            }
        }
    }
}