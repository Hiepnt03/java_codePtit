import java.util.Scanner;

public class J02011{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        for (int i = 0; i < n-1; i++) 
        {
            int index_min = i;
            for (int j = i+1; j < n; j++) 
                if( arr[j] < arr[index_min] ) 
                    index_min = j;
            int tmp = arr[i];
            arr[i] = arr[index_min];
            arr[index_min] = tmp;
            System.out.printf("Buoc %d: ", i+1);
            for (int j = 0; j < n; j++) 
                System.out.print(arr[j]+" ");
            System.out.println("");
        }
    }
}