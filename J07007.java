import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

class WordSet{
    private TreeSet<String> ds;
    WordSet(String filepath) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(filepath));
        this.ds = new TreeSet<>();
        while (sc.hasNextLine()) {
            String datas [] = sc.nextLine().toLowerCase().split("\\s+");
            ds.addAll(Arrays.asList(datas));
        }
    }
    @Override
    public String toString() {
        String result = "";
        int index = 0 ;
        for (String i : ds){
            index++;
            if(index == ds.size())
                result += i;
            else    
                result += i + "\n";
        }  
        return result;
    }
}
public class J07007 {
    public static void main(String[] args) throws IOException {
            WordSet ws = new WordSet("VANBAN.in");
            System.out.println(ws);
        }
}