import java.util.Scanner;

public class J03025 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            t--;
        }
    }
    public static boolean check(String s)
    {
        int result = 0;
        int n = s.length();
        for(int i=0; i< n/2; i++){
            if( s.charAt(i) != s.charAt(n-i-1)){
                result++;
            }
        }
        if( result == 0){
            if( n%2 == 0){
                return false;
            }
            else {
                return true;
            }
        }
        else if( result == 1){
            return true;
        }
        else {
            return false;
        }
    }
}