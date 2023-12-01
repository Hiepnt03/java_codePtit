import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Scanner;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            Queue<Long> queue = new ArrayDeque<>();
            ArrayList<Long> arrayList = new ArrayList<>();
            queue.add((long) 6);
            queue.add((long) 8);
            while (true) {
                long tmp = queue.remove();
                if(tmp > Math.pow(10, n))
                    break;
                arrayList.add(tmp);
                queue.add(tmp*10+6);
                queue.add(tmp*10+8);
            }
            System.out.println(arrayList.size());
            for(int i=arrayList.size()-1; i>=0; i--)
                System.out.print(""+arrayList.get(i)+" ");
            System.out.println();
        }
    }
}
