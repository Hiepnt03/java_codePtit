import java.util.Scanner;

public class J01013 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int [] number = new int[n];
        for (int i = 0; i < n; i++) 
            number[i] = sc.nextInt();
        for (int i = 0; i < n; i++) 
            sum += pt_snt(number[i]);
        System.out.println(sum);
    }
    public static boolean check_snt(int n)
    {
        if( n == 1) return false;
        if( n==2 || n== 3) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if( n%i == 0) 
                return false;
        return true;
    }
    public static int pt_snt(int n)
    {
        int sum = 0;
        while(n>1)
        {
            if( check_snt(n))
            {
                sum +=n;
                n = 1;
            }
            else
            {
                for (int i = 2; i <= Math.sqrt(n); i++)
                    if( n % i == 0)
                    {
                        sum = sum + i;
                        n = n/i;
                        break;
                    }
            }
        }
        return sum;
    }
}
