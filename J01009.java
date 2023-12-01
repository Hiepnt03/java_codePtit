import java.util.Scanner;

public class J01009 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long []gt = new long[n+1];
        gt[1] = 1;
        long result = 0;
        for (int i = 2; i <= n; i++) 
            gt[i] = gt[i-1] * i;
        for (int i = 1; i <= n; i++) 
            result = result + gt[i];
        System.out.print(result);
    }
}
