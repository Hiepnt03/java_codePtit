import java.util.Scanner;
class NhanVien{
    private String MaNV = "00001";
    private String HoTen,GioiTinh,NgaySinh,DiaChi,MaSoThue,NgayKiHopDong;
    NhanVien(){}
    NhanVien(String HoTen,String GioiTinh,String NgaySinh,String DiaChi, String MaSoThue, String NgayKiHopDong )
    {
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.MaSoThue = MaSoThue;
        this.NgayKiHopDong = NgayKiHopDong;
    }
    void in()
    {
        System.out.printf("%s %s %s %s %s %s %s\n",MaNV,HoTen,GioiTinh,NgaySinh,DiaChi,MaSoThue,NgayKiHopDong);
    }
}
public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien A = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        A.in();
    }
}
