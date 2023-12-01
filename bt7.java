import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class bt7{
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
        ArrayList<Long> arr = new ArrayList<>();
        for (String o : tmp) 
        {
            try {
                long number = Long.parseLong(o);
                arr.add(number);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        BigInteger sum = BigInteger.ZERO;
        for (Long i : arr) 
            if( i > Integer.MAX_VALUE)
            {
                BigInteger tmp1 = new BigInteger(String.valueOf(i));
                sum = sum.add(tmp1);
            }
        System.out.print(sum);
    }
}