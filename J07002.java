import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07002{
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
        int sum = 0;
        for (Integer i : arr) {
            sum += + i;
        }
        System.out.print(sum);
    }
}