import java.util.Scanner;

public class J03007 {
    public static void main(String[] args)
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
        int n = s.length();
        int sum = 0;
        if(s.charAt(0) != '8' || s.charAt(n-1) != '8')
        {
            return false;
        }
        for(int i =0; i<n; i++){
            sum = sum + (s.charAt(i) - '0');
        }
        if(sum % 10 != 0){
            return false;
        }
        for(int i=0; i<= n/2; i++){
            if( s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
