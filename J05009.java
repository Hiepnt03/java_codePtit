import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ThiSinh implements Comparable<ThiSinh>{
    private String name,birthday;
    private double d1,d2,d3,sum;
    private int id;
    ThiSinh(Scanner sc){
        sc.nextLine();
        this.name = sc.nextLine();
        this.birthday = sc.next();
        this.d1 = sc.nextDouble();
        this.d2 = sc.nextDouble();
        this.d3 = sc.nextDouble();
        this.sum = d1+d2+d3;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public String toString(){
        return String.valueOf(id) + " "+ this.name + " " 
            + this.birthday + " " + String.format("%.1f",this.sum);
    }

    @Override
    public int compareTo(ThiSinh o) {
        if( this.sum > o.sum ) return -1;
        else return 1;
    }

}

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double maxx = 0;
        ArrayList<ThiSinh> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ThiSinh tmp = new ThiSinh(sc);
            tmp.setId(i);
            ds.add(tmp);
            maxx = Math.max(maxx, tmp.getSum());
        }
        Collections.sort(ds);
        for (ThiSinh i : ds) {
            if( i.getSum() < maxx ) break;
            System.out.println(i);
        }
    }
}
