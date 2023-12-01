import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class J08024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            Queue<Long> queue = new ArrayDeque<>();
            queue.add((long) 9);
            while (true) {
                long tmp = queue.remove();
                if (tmp % n == 0) {
                    System.out.println(tmp);
                    break;
                }
                queue.add(tmp*10);
                queue.add(tmp*10+9);
            }
        }
    }
}
