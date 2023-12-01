import java.util.Scanner;

public class GiangVien {
    private String MaGV,TenGV;
    private double GioChuan;

    public GiangVien(Scanner sc) {
        this.GioChuan = 0;
        String datas[] = sc.nextLine().split("\\s+");
        this.MaGV = datas[0];
        this.TenGV = "";
        for (int i = 1; i < datas.length; i++)
            this.TenGV += datas[i] + " ";
        this.TenGV.trim();
    }

    public String getMaGV() {
        return MaGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void TinhGioChuan(double value) {
        this.GioChuan += value;
    }

    @Override
    public String toString() {
        return this.TenGV + " " + String.format("%.2f",this.GioChuan);
    }
}
