import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t>0) {
            t--;
            String s = sc.nextLine();
            String[] data = s.split("\\s+");
            for (String string : data) {
                StringBuilder tmp = new StringBuilder(string);
                System.out.print(tmp.reverse()+" ");
            } 
            System.out.println();
        }
    }
}
