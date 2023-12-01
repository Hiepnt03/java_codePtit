import java.util.Scanner;
import java.util.TreeSet;

public class J02007 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1; j<=t; j++)
        {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < arr.length; i++) 
                arr[i] = sc.nextInt();
            int [] count = new int[100000];
            for (int i = 0; i < count.length; i++) 
                count[i] = 0;
            for (int i : arr) 
                count[i]++;
            TreeSet <Integer> data = new TreeSet<>();
            for (int x : arr) 
                data.add(x);
            System.out.printf("Test %d:\n",j);
            for (int i : arr) 
                if( data.contains(i))
                {
                    System.out.printf("%d xuat hien %d lan\n",i,count[i]);
                    data.remove(i);
                }
        }
    }
}
