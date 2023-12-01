import java.util.ArrayList;
import java.util.Scanner;

class NhanVien {
    private String id,name,sex,birthday,address,tax_id,time_sign_contract;
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
    }
    public void setId(String id) {
        this.id = id;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.sex +" " +this.birthday 
        + " "+ this.address +" " + this.tax_id + " "+this.time_sign_contract;
    }
}
public class J05006 {

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
        for (NhanVien nhanVien : ds) System.out.println(nhanVien);
    }
}
