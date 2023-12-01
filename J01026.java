import java.util.Scanner;

public class J01026 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) 
        {
            int n = sc.nextInt();
            int result = (int)Math.sqrt(n);
            if( n == result*result )
                System.out.println("YES");
            else    
                System.out.println("NO");
        }
    }
}
