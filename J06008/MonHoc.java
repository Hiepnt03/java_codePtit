import java.util.Scanner;

public class MonHoc {
    private String MaMH, TenMH;

    public MonHoc(Scanner sc) {
        String data = sc.nextLine();
        String datas [] = data.split("\\s+");
        this.MaMH = datas[0];
        this.TenMH = data.substring(this.MaMH.length()+1);
    }

    public String getMaMH() {
        return MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }
}
