import java.util.Scanner;

class NhanVien{
    private String MaNV = "NV01";
    private String Name,ChucVu;
    private int Salary_Basic,Date;
    NhanVien(){}
    NhanVien(String Name, int Salary_Basic, int Date,String ChucVu){
        this.Name = Name;
        this.Salary_Basic = Salary_Basic;
        this.Date = Date;
        this.ChucVu = ChucVu;
    }
    public void in(){
        double luongthang=this.Salary_Basic*this.Date,thuong = 0,phucap=0,tong = 0;
        if(this.Date >= 25)
            thuong = luongthang*20/100;
        else if(this.Date >= 22)
            thuong = luongthang*10/100;
        if(this.ChucVu.equals("GD"))
            phucap = 250000;
        if(this.ChucVu.equals("PGD"))
             phucap = 200000;
        if(this.ChucVu.equals("TP"))
             phucap = 180000;
        if(this.ChucVu.equals("NV"))
            phucap = 150000;
        tong = luongthang + thuong + phucap;
        System.out.printf("%s %s %.0f %.0f %.0f %.0f\n",this.MaNV,this.Name,luongthang,thuong,phucap,tong);
    }
}
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.next());
        nv.in();
    }
}
