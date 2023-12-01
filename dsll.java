import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String id,name,classs,mail,phone;

    SinhVien(String id, String name, String classs, String mail,String phone){
        this.id = id;
        this.name = name;
        this.classs = classs;
        this.mail = mail;
        this.phone = "0" + phone;
    }

    public String toString(){
        return this.id+" "+this.name+" " + this.classs+" "+this.mail+" "+this.phone;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.classs.equals(o.classs))
            return this.id.compareTo(o.id);
        return this.classs.compareTo(o.classs);
    }
}

public class dsll {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> ds = new ArrayList<>();
        while (sc.hasNextLine())
            ds.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine()));
        
        Collections.sort(ds);
        for (SinhVien i : ds) System.out.println(i);
    }
}
