import java.util.Scanner;
import java.util.TreeSet;

public class J02006 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        TreeSet <Integer> arr = new TreeSet<>();
        for (int i = 0; i < m+n; i++) 
        {
            int tmp = sc.nextInt();
            arr.add(tmp);
        }
        for (Integer integer : arr) 
        {
                System.out.print(integer);
                System.out.print(" ");
        }
    }
}
