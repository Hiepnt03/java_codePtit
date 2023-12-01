import java.util.Scanner;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-->0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) 
                arr[i] = sc.nextLong();
            
            long ans [] = new long[n];
            ans[n-1] = arr[n-1];
            for (int i = n-2; i >= 0; i--) {
                int tmp = i+1;
                while (tmp <= n-1) {
                    if(arr[i] < arr[tmp]){
                        ans[i] = arr[i+1];
                        break;
                    }else if(arr[i] >= arr[tmp] && arr[i] < ans[tmp]){
                        ans[i] = ans[tmp];
                        break;
                    }else
                        tmp++;
                }
                if( tmp==n && ans[i] == 0)
                    ans[i] = arr[i];
            }

            for (int i = 0; i < n; i++) {
                if( arr[i] != ans[i] )
                    System.out.print(""+ans[i]+" ");
                else   
                    System.out.print("-1 ");
            }
            System.out.println();
        }

    }
}
