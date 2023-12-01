import java.util.Scanner;

public class J01018{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean check(String s)
    {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + ( s.charAt(i) - '0');
            if(i != s.length() - 1)
            {
                if( Math.abs( (s.charAt(i+1) -'0') - (s.charAt(i) - '0' )) != 2)
                {
                    return false;
                }
            }
        }
        if( sum % 10 != 0){
            return false;
        }
        else {
            return true;
        }
    }
}