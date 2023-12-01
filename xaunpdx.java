import java.util.Scanner;

public class xaunpdx {
    public static int n,m;
    public static int[] a = new int[20];
    public static void out(){
        for (int i = 1; i <= m; i++) {
            System.out.print(a[i]);
        }
        for (int i = m; i > 0; i--) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    public static void Try(int i){
        for (int j = 0; j <=1; j++) {
            a[i] = j;
            if( i==m ) out();
            else Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            int k = (int) n/2;
            for ( m = 1; m <= k; m++) {
                Try(1);
            }
            System.out.println("");
        }
    }
}
