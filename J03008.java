import java.util.Scanner;

public class J03008 {
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
        for(int i=0; i< n; i++){
            if( s.charAt(i) == '1' || s.charAt(i) == '4' || s.charAt(i) == '6' || s.charAt(i) == '8' || s.charAt(i) == '9'){
                return false;
            }
        }
        for(int i=0; i<= n/2; i++){
            if( s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
