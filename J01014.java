import java.util.Scanner;

public class J01014 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            long n = sc.nextLong();
            long result = 0;
            while(n>1)
            {
                if(check_snt(n))
                {
                    result = Math.max(result,n);
                    n = 1;
                }
                else
                    for (long i = 2; i <= Math.sqrt(n); i++) 
                        if( n%i == 0 )
                        {
                            n = n /i;
                            result = Math.max(result,i);
                            break;
                        }
            }
            System.out.println(result);
        }
    }
    public static boolean check_snt(long n)
    {
        if( n == 1) return false;
        if( n==2 || n== 3) return true;
        for (long i = 2; i <= Math.sqrt(n); i++) 
            if( n%i == 0) 
                return false;
        return true;
    }
}
