import java.util.Scanner;
import java.util.TreeSet;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<String> result1 = new TreeSet<>();
        TreeSet<String> result2 = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            String tmp[] = s.trim().toLowerCase().split("\\s+");
            for (String string : tmp) {
                result1.add(string);
            }
        }
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= m; i++) {
            String s = sc.nextLine();
            String tmp[] = s.trim().toLowerCase().split("\\s+");
            for (String string : tmp) {
                result2.add(string);
            }
        }
        for (String o : result1) {
            boolean ok = result2.contains(o);
            if(ok == false)
                System.out.printf("%s ",o);
        }
        System.out.println();
        for (String o : result2) {
            boolean ok = result1.contains(o);
            if(!ok)
                System.out.printf("%s ",o);
        }
    }
}
