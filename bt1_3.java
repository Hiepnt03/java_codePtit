import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bt1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            TreeSet <Integer> number_c = new TreeSet<>();
            TreeSet <Integer> number_l = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                if (tmp % 2 == 0) number_c.add(tmp);
                else number_l.add(tmp);
            }
            for (Integer i : number_c) System.out.printf("%d ",i);
            System.out.println();
            ArrayList<Integer> ds_l = new ArrayList<>(number_l);
            Collections.reverse(ds_l);
            for (Integer i : ds_l) System.out.printf("%d ",i);
            System.out.println();
        }
    }
}
