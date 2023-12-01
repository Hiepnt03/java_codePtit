import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Giang_Vien implements Comparable<Giang_Vien>{
    private String id,ten,bo_mon="";
    Giang_Vien(){}
    Giang_Vien(String id,Scanner sc){
        this.id = id;
        this.ten = sc.nextLine();
        String bo_mon = sc.nextLine();
        String data[] = bo_mon.toUpperCase().split("\\s+");
        for (String i : data) this.bo_mon += i.charAt(0);
    }
    @Override
    public int compareTo(Giang_Vien o) {
       String data1 [] = this.ten.toLowerCase().split("\\s+");
       String data2 [] = o.ten.toLowerCase().split("\\s+");
       return data1[data1.length - 1].compareTo(data2[data2.length - 1]);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + bo_mon;
    }
}
public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Giang_Vien> ds = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String id = "GV";
            if(i<10) id = id + "0" + String.valueOf(i);
            else id = id + String.valueOf(i);
            ds.add(new Giang_Vien(id, sc));
        }
        Collections.sort(ds);
        for (Giang_Vien i : ds) System.out.println(i);
    }
}
