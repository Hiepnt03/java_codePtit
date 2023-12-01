import java.util.Scanner;
import java.util.Stack;

public class bt5_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int right = -1;
            int left = -1;
            Stack<Integer> stack = new Stack<>();
            for (int j = i; j < n; j++) {
                if (a[j] > a[i]) {
                    right = j;
                    break;
                }
                stack.push(a[j]);
            }

            stack = new Stack<>();
            for (int j = 0; j <= i; j++) {
                if (a[j] > a[i]) {
                    left = j;
                    break;
                }
                stack.push(a[j]);
            }

            if (right == -1 && left == -1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
