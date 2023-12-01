import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr = new int[n][3];
        int count[] = new int[n];
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < 3; j++) 
            {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 1)
                    count[i]++;    
            }
        int result = 0;
        for (int i = 0; i < n; i++)
            if( count[i] >= 2)
                result++;
        System.out.println(result);
    }
}
