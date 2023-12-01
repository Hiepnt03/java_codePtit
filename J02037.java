import java.util.Scanner;

public class J02037 {
    public static boolean check(int n, int count_chan) 
    {
        if ( n%2 == 0 && count_chan > (n - count_chan) )
                return true;
        if ( n%2 == 1 && (n - count_chan) > count_chan)
                return true;
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t>0) {
            t--;
            String s = sc.nextLine();
            String [] result = s.split("\\s+");
            int count_chan = 0;
            for (String tmp : result) 
                if ( (tmp.charAt(tmp.length()-1) - '0') % 2 == 0 )
                    count_chan++;
            if(check(result.length, count_chan))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
