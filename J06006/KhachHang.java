package J06006;

import java.util.Scanner;

public class KhachHang {
    private String MaKH,TenKH,GioiTinh,NgaySinh,DiaChi;
    static int sttKH = 1;
    public KhachHang(Scanner sc) {
        this.MaKH = String.format("KH%03d", sttKH++);
        this.TenKH = sc.nextLine();
        this.GioiTinh = sc.nextLine();
        this.NgaySinh = sc.nextLine();
        this.DiaChi = sc.nextLine();
    }

    public String getMaKH() {
        return MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public String getDiaChi() {
        return DiaChi;
    }
}
