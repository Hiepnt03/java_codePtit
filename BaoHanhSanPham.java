import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class SanPham{
    private String id_sp, name, cost, time_bh;
    SanPham(Scanner sc){
        this.id_sp = sc.next();
        sc.nextLine();
        this.name = sc.nextLine();
        this.cost = sc.next();
        this.time_bh = sc.next();
    }
    public String getId_sp() {
        return id_sp;
    }
    public String getTime() {
        return time_bh;
    }
    public String getCost() {
        return cost;
    }

}
class KhachHang implements Comparable<KhachHang>{
    private String id_kh, name, address,id_sp,total,time_bh;
    ArrayList<SanPham> ds;
    KhachHang(String id,Scanner sc){
        this.id_kh = id;
        sc.nextLine();
        this.name = sc.nextLine();
        this.address = sc.nextLine();
        this.id_sp = sc.next();
        this.total = sc.next();
        this.time_bh = sc.next();
        this.ds = new ArrayList<>();
    }
    
    public void setTime_bh(SanPham o) {
        String time_buy = this.time_bh;
        int moth_buy = Integer.parseInt(time_buy.substring(3, 5));
        int day_bh = Integer.parseInt(time_buy.substring(2));
        int moth_bh = Integer.parseInt(o.getTime()) + moth_buy;
        int year_bh = Integer.parseInt(time_buy.substring(6, 10)) + (int)moth_bh/12;
        moth_bh = moth_bh%12;
        String ans = day_bh+"/"+moth_bh+"/"+year_bh;
        this.time_bh = ans;
    }
    public void setTotal(SanPham o) {
        int total = Integer.parseInt(o.getCost()) * Integer.parseInt(this.total);
        this.total = String.valueOf(total);
    }
    public String getId_kh() {
        return id_kh;
    }
    public String getId_sp() {
        return id_sp;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getTime_bh() {
        return time_bh;
    }
    public String getTotal() {
        return total;
    }

    @Override
    public int compareTo(KhachHang o) {
        if( this.time_bh.substring(6).equals(o.time_bh.substring(6)) ){
            if( this.time_bh.substring(3,5).equals(o.time_bh.substring(3,5)) ){
            
        }
            return this.time_bh.substring(6).compareTo(o.time_bh.substring(6));
        }
        return this.time_bh.substring(3,5)compareTo(o.time_bh.substring(3,5));
    }
}
public class BaoHanhSanPham {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = sc.nextInt();
        ArrayList<SanPham> ds_sp = new ArrayList<>();
        ArrayList<KhachHang> ds_kh = new ArrayList<>();

        while (n-->0) 
            ds_sp.add(new SanPham(sc));
        sc.nextLine();
        int m = sc.nextInt();
        for(int i =1; i<=m; i++) {
            String id;
            if(i<10) id = "KH0" + String.valueOf(i);
            else id = "KH" + String.valueOf(i);
            ds_kh.add(new KhachHang(id, sc));
        }
        for (KhachHang kh : ds_kh) 
            for (SanPham sp : ds_sp) 
                if( kh.getId_sp().equals(sp.getId_sp())){
                    kh.setTime_bh(sp);
                    kh.setTotal(sp);
                } 
        Collections.sort(ds_kh);
        for (KhachHang i : ds_kh) {
            String x = i.getId_kh() +' '+ i.getName()+' '+i.getAddress()+' '+i.getId_sp()+' '+i.getTotal() + ' '+i.getTime_bh();
            System.out.println(x);
        }
    }
}
