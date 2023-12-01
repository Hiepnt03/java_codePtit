
import java.util.Scanner;

public class J01007 {
    public static void  fibonacci(long fibo[]){
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2;i<=92;i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long []fibo = new long[93];
        fibonacci(fibo);
        while(t>0){
            t--;
            long n = sc.nextLong();
            int check = 0;
            for(int i=0; i<=92; i++){
                if( n == fibo[i] )
                {
                    System.out.println("YES");
                    check = 1;
                    break;
                }
            }
            if ( check == 0){
                System.out.println("NO");
            }
        }
    }
}

