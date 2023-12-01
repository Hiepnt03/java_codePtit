import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J05033 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<time> list = new ArrayList<>();
        while (n --> 0) {
            int gio=sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            list.add(new time(gio, phut, giay));
        }
        Collections.sort(list, new Sort_time());
        for (time resul : list) {
            time.in(resul);
        }
    }
}
class time{
    private int gio,phut,giay;
    time(){}
    time(int gio,int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    public int getGio() {
        return gio;
    }
    public int getPhut() {
        return phut;
    }
    public int getGiay() {
        return giay;
    }
    public static void in(time p){
        System.out.printf("%d %d %d\n",p.gio,p.phut,p.giay);
    }
}
class Sort_time implements Comparator<time>{

    @Override
    public int compare(time o1, time o2) {
        if(o1.getGio() > o2.getGio()) return 1;
        else if(o1.getGio() < o2.getGio()) return -1;
        else{
            if(o1.getPhut() > o2.getPhut()) return 1;
            else if(o1.getPhut() < o2.getPhut()) return -1;
            else{
                if(o1.getGiay() > o2.getGiay()) return 1;
                else return -1;
            }
        }
    }

}
