import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class NhanVien implements Comparable<NhanVien>{
    private String id,name,sex,birthday,address,
                    tax_id,time_sign_contract;
    private int day,month,year;
    NhanVien(){}
    NhanVien(Scanner sc){
        sc.nextLine();
        this.name = sc.nextLine();
        this.sex = sc.next();
        this.birthday = sc.next();
        sc.nextLine();
        this.address = sc.nextLine();
        this.tax_id = sc.next();
        this.time_sign_contract = sc.next();
        this.day = Integer.parseInt(this.birthday.substring(0,2));
        this.month = Integer.parseInt(this.birthday.substring(3,5));
        this.year = Integer.parseInt(this.birthday.substring(6,10));
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.sex +" " +this.birthday 
        + " "+ this.address +" " + this.tax_id + " "+this.time_sign_contract;
    }
    @Override
    public int compareTo(NhanVien o) {
        if(  this.year > o.year ) return 1;
        else if(  this.year < o.year ) return -1;
        else{
            if(  this.month > o.month ) return 1;
            else if(  this.month < o.month ) return -1;
            else{
                if(  this.day > o.day ) return 1;
                else if(  this.day < o.day ) return -1;
                else return this.getId().compareTo(o.getId());
            }
        }
    }
}
public class J05007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> ds = new ArrayList<>();
        for (int i = 1; i<= n; i++) {
            String id = "000";
            if (i<10) id += "0" + String.valueOf(i);
            else id += String.valueOf(i);
            NhanVien tmp = new NhanVien(sc);
            tmp.setId(id);
            ds.add(tmp);
        }
        Collections.sort(ds);
        for (NhanVien nhanVien : ds) System.out.println(nhanVien);
    }
}
