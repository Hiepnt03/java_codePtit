import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogThoiGian {
    public static boolean isTimeFormatValid(String time){
        String timeReqex = "([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
        Pattern pattern = Pattern.compile(timeReqex);
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> list = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String [] words = s.split("[\t\n.,]+");
            for (String i : words) {
                if(isTimeFormatValid(i))
                    list.add(i);
            }
        }
        for (String i : list) {
            System.out.println(i);
        }
    }
}
