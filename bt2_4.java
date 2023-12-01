import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class bt2_4 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> al1 = (ArrayList<String>) ois1.readObject();
        TreeSet<String> ts1 = new TreeSet<>();
        for (String i : al1) ts1.add(i);

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> al2 = (ArrayList<Integer>) ois2.readObject();
        TreeSet<Integer> ts2 = new TreeSet<>();
        for (Integer i : al2) ts2.add(i); 


        for (String i : ts1) {
            for (Integer j : ts2) {
                System.out.println(i + j);
            }
            
        }
    }
}
