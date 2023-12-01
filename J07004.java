import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07004{
    public static String ReadToFile(String FileName){
        String s = "";
        try {
            File file = new File(FileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                s = s + line + " ";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Không thể tìm thấy file: " + FileName);
        }
        return s;
    }
    public static void main(String[] args) {
        String s = ReadToFile("DATA.in");
        String tmp[] = s.trim().split("\\s+");
        ArrayList<Integer> arr = new ArrayList<>();
        for (String o : tmp) 
        {
            try {
                int number = Integer.parseInt(o);
                arr.add(number);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        int count[] = new int[1000];
        for (Integer i : arr) {
            count[i] +=1;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0){
                System.out.printf("%d %d\n",i,count[i]);
            }
        }
    }
}