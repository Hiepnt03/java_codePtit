import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class XLVB2 {
    public static boolean XuLy(String s){
        for (int i = 0; i < s.length(); i++) 
            if(Character.isDigit(s.charAt(i)))
                return true;
        return false;
    }
    public static boolean Check(String s){
        for (int i = 0; i < s.length(); i++) 
            if(s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '!'||
            s.charAt(i) =='?' || s.charAt(i) == ':')
                return false;
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> ds = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.next();
            if(XuLy(s) && Check(s))
                ds.add(s);
        }
        for (String i : ds) {
            System.out.println(i);
        }
    }
}
