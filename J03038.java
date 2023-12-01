import java.util.Scanner;
import java.util.TreeSet;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        TreeSet <Character> result = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }
        System.out.println(result.size());
    }
}
