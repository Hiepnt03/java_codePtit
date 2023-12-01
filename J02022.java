import java.util.Scanner;

public class J02022 {
    public static boolean Check(long n,int number){
        int count [] = new int[number+1];
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') 
                return false;

            count[s.charAt(i)-'0']++;
            if(count[s.charAt(i)-'0'] > 1) return false;

            if(i!= s.length()-1)
                if( Math.abs((s.charAt(i) - '0') - (s.charAt(i+1) -'0')) == 1 )
                    return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int number = sc.nextInt();
            for (long i = (long) Math.pow(10, number-1); i < Math.pow(10, number) ; i++) 
                if(Check(i,number))
                    System.out.println(i);
        }
    }
}
