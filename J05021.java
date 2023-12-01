import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String id,name,classs,mail;

    SinhVien(String id, String name, String classs, String mail){
        this.id = id;
        this.name = name;
        this.classs = classs;
        this.mail = mail;
    }

    public String toString(){
        return this.id+" "+this.name+" " + this.classs+" "+this.mail;
    }

    @Override
    public int compareTo(SinhVien o) {
            return this.id.compareTo(o.id);
    }
}

public class J05021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        while (sc.hasNextLine())
            ds.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        Collections.sort(ds);
        for (SinhVien i : ds) System.out.println(i);
    }
}
