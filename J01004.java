import java.util.Scanner;
public class J01004 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0)
    {
        int n = sc.nextInt();
        int ok = 0;
        if(n == 1)
        {
            System.out.println("NO");
        } 
        else if( n == 3 || n == 2)
        {
            System.out.println("YES");
        }
        else
        {
            for(int i=2; i<=Math.sqrt(n); i++)
            {
                if( n % i == 0)
                {
                    System.out.println("NO");
                    ok = 1;
                    break;
                }
            }
            if( ok == 0)
            {
                System.out.println("YES");
            }
        }
        t--;
    }
    }
}
