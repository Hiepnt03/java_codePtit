package J06006;

import java.util.Scanner;

public class MatHang {
    private String MaMH,TenMH,dvt;
    private long GiaMua,GiaBan;
    static int sttMH = 1;
    public MatHang(Scanner sc) {
        this.MaMH = String.format("MH%03d",sttMH++);
        this.TenMH = sc.nextLine();
        this.dvt = sc.nextLine();
        this.GiaMua = Long.parseLong(sc.nextLine());
        this.GiaBan = Long.parseLong(sc.nextLine());
    }

    public String getMaMH() {
        return MaMH;
    }

    public long getGiaBan() {
        return GiaBan;
    }

    public long getGiaMua() {
        return GiaMua;
    }

    public String getTenMH() {
        return TenMH;
    }
}
