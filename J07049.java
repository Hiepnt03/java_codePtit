import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

class SanPham{
    private String id_sp,name_sp,cost,time_bh;
    SanPham(Scanner sc){
        this.id_sp = sc.nextLine();
        this.name_sp = sc.nextLine();
        this.cost = sc.nextLine();
        this.time_bh = sc.nextLine();
    }
    public String getId_sp() {
        return id_sp;
    }
    public String getCost() {
        return cost;
    }
    public String getTime_bh() {
        return time_bh;
    }
}

class KhachHang implements Comparable<KhachHang> {
    private String id_kh, name_kh,address,id_sp,total_buy;
    private Date time_buy,time_exp;
    KhachHang(String id_kh,Scanner sc) throws ParseException{
        this.id_kh = id_kh;
        this.name_kh = sc.nextLine();
        this.address = sc.nextLine();
        this.id_sp = sc.nextLine();
        this.total_buy = sc.nextLine();
        this.time_buy = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
    }
    public String getId_sp() {
        return id_sp;
    }
    public void update(SanPham i) throws ParseException,NumberFormatException {
       // Tạo một SimpleDateFormat theo định dạng "dd/MM/yyyy"
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Tạo một đối tượng Calendar
        Calendar calendar = Calendar.getInstance();
        // Thiết lập ngày cho calendar
        calendar.setTime(this.time_buy);

        // Thêm một tháng vào calendar
        calendar.add(Calendar.MONTH, Integer.parseInt(i.getTime_bh()));
        // Lấy ngày mới từ calendar
        this.time_exp = calendar.getTime();

        // set tổng tiền
        this.total_buy = String.valueOf(Integer.parseInt(this.total_buy)*Integer.parseInt(i.getCost())) ;
    }

    @Override
    public String toString() {
        // Tạo một SimpleDateFormat theo định dạng "dd/mm/yyyy"
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return id_kh + " " + name_kh + " " + address + " " + id_sp + " " + total_buy+ " "+sdf.format(time_exp);
    }
    @Override
    public int compareTo(KhachHang o) {
        if( this.time_exp.getTime() > o.time_exp.getTime() ) return 1;
        else if( this.time_exp.getTime() < o.time_exp.getTime() ) return -1;
        else return this.id_kh.compareTo(o.id_kh);
    }
    
}
public class J07049 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        ArrayList<SanPham> list_sp = new ArrayList<>();
        ArrayList<KhachHang> list_kh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());

        while (n-->0) 
            list_sp.add(new SanPham(sc));

        int m = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= m; i++) {
            String id_kh="";
            if(i<10) id_kh = "KH0" + i;
            else id_kh = "KH" +i;
            list_kh.add(new KhachHang(id_kh, sc));
        }
        for (KhachHang kh : list_kh) 
            for (SanPham sp : list_sp) 
                if(kh.getId_sp().equals(sp.getId_sp()))
                    kh.update(sp);

        Collections.sort(list_kh);
        for (KhachHang i : list_kh) System.out.println(i);
    }
}
