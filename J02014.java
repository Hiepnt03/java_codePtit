import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            t--;
            boolean ok = false;
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) 
                arr[i] = sc.nextInt();
            int sum_left[] = new int[n];
            int sum_right[] = new int[n];
            sum_left[0] = 0;
            for (int i = 1; i < sum_left.length; i++) 
                sum_left[i] = sum_left[i-1]+arr[i-1];
            sum_right[n-1] = 0;
            for (int i = sum_right.length - 2; i >=0; i--) 
                sum_right[i] = sum_right[i+1] + arr[i+1];
            for (int i = 0; i < arr.length; i++) 
                if( sum_left[i] == sum_right[i])
                {
                    System.out.println(i+1);
                    ok = true;
                    break;
                }
            if(ok == false)
                System.out.println("-1");
        }
    }
}
