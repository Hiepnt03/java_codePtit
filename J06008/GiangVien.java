import java.util.ArrayList;
import java.util.Scanner;

public class GiangVien {
    private String MaGV,TenGV;
    private double GioChuan;
    private ArrayList<String> ds_giangday;
    public GiangVien(Scanner sc) {
        ds_giangday = new ArrayList<>();
        this.GioChuan = 0;
        String data = sc.nextLine();
        String datas [] = data.split("\\s+");
        this.MaGV = datas[0];
        this.TenGV = data.substring(this.MaGV.length()+1);
    }

    public String getMaGV() {
        return MaGV;
    }

    public String getTenGV() {
        return TenGV;
    }

    public void TinhGioChuan(String data, double value){
        this.GioChuan += value;
        this.ds_giangday.add(data);
    }

    @Override
    public String toString() {
        String result = "Giang vien: "+ this.TenGV + "\n";
        for (String i: ds_giangday)
            result += i +"\n";
        result += "Tong: "+String.format("%.2f",GioChuan);
        return  result;
    }
}
