import java.util.Scanner;

public class J01012 {
    static int count(int n){
        if( n == 1 || n == 3 ) return 0;
        else if( n == 2 ) return 1;
        else if( n == 4 ) return 2;
        else{
            int cnt = 0;
            int tmp = (int)Math.sqrt(n);   

            if( tmp*tmp == n && tmp % 2 == 0 ) cnt--;     
            if( n%2 == 0 ) cnt++;
            
            for( int i=2; i<=tmp; i++)
                if( n % i == 0 ){
                    if( i % 2 == 0 ) cnt++;
                    if( (n/i) % 2 == 0 ) cnt++;
                }
            return cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            System.out.println(count(n));
        }
    }
}
