import java.util.Scanner;

public class J01017
{
    public static boolean check(long s)
    {
        while(s>=10)
        {
            long a = s % 10;
            long b = ((long)s/10)%10;
            if ( Math.abs(a-b) != 1 )
                return false;
            s = s / 10;
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            long s = sc.nextLong();
            if( check(s) ) 
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}