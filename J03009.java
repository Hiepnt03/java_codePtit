import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t>0) 
        {
            t--;
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String [] xaus1 = s1.split("\\s+");
            String [] xaus2 = s2.split("\\s+");
            TreeSet<String> tmp = new TreeSet<String>();
            for (String string : xaus1) 
                tmp.add(string);
            for (String string : xaus2) 
                tmp.add(string);
            for (String string : tmp) 
            {
                if(s2.contains(string))
                    continue;
                System.out.printf("%s ",string);
            }
            System.out.println("");
        }
    }
    
}