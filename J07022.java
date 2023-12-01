import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Vector<String> ds = new Vector<>();
        while (sc.hasNext()) {
            String data = sc.next();
            try {
                Integer.parseInt(data);
            } catch (NumberFormatException e) {
                ds.add(data);
            }
        }
        Collections.sort(ds);
        for (String i : ds) 
            System.out.print(i+" ");
    }
}