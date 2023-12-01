import java.util.Scanner;

public class MonHoc {
    private String MaMH, TenMH;

    public MonHoc(Scanner sc) {
        String datas[] = sc.nextLine().split("\\s+");
        this.MaMH = datas[0];
        this.TenMH = "";
        for (int i = 1; i < datas.length; i++)
            this.TenMH += datas[i];
    }

    public String getMaMH() {
        return MaMH;
    }
}
