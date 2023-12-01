import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;


class Sinh_Vien implements Comparable<Sinh_Vien> {
    private String name;
    private long time;
    Sinh_Vien(String name, long time){
        this.name = name;
        this.time = time;
    }
    @Override
    public String toString() {
        return name + " " + time;
    }
    @Override
    public int compareTo(Sinh_Vien o) {
        if (o.time == this.time)
            return this.name.compareTo(o.name);
        else
            if (o.time > this.time) return 1;
            else return -1;
    }

}

public class bt2_3 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        ArrayList<Sinh_Vien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-->0){
            String name = sc.nextLine();
            String timeString = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
            Date date = sdf.parse(timeString);
            long time = date.getTime();
            String timeString2 = sc.nextLine();
            Date date2 = sdf.parse(timeString2);
            long time2 = date2.getTime();

            long minutes = (long) ((time2-time)/(60000));
            Sinh_Vien sv = new Sinh_Vien(name, minutes);
            ds.add(sv);
        }
        Collections.sort(ds);
        for (Sinh_Vien i : ds) System.out.println(i);
    }
}
