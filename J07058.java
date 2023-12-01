import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{
    private String id,name,thi;

    MonHoc(String id, String name, String thi){
        this.thi = thi;
        this.name = name;
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return id + " " + name + " " + thi;
    }
    @Override
    public int compareTo(MonHoc other) {
        return this.id.compareTo(other.id);
    }
}

public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int mh = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> ds = new ArrayList<>();
        while (mh-->0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String thi = sc.nextLine();
            MonHoc p = new MonHoc(id, name, thi);
            ds.add(p);
        }
        Collections.sort(ds);
        for (MonHoc x : ds) {
            System.out.println(x);
        }
    }
}
