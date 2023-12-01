import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String id,name,classs,mail;

    SinhVien(Scanner sc){
        this.id = sc.next();
        sc.nextLine();
        this.name = sc.nextLine();
        this.classs = sc.next();
        this.mail = sc.next();
    }

    public String toString(){
        return this.id+" "+this.name+" " + this.classs+" "+this.mail;
    }

    @Override
    public int compareTo(SinhVien o) {
        if( this.classs.equals(o.classs) )
            return this.id.compareTo(o.id);
        return this.classs.compareTo(o.classs);
    }
}

public class J05020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<SinhVien> ds = new ArrayList<>();
        while (n-->0) 
            ds.add(new SinhVien(sc));
        Collections.sort(ds);
        for (SinhVien i : ds) System.out.println(i);
    }
}
