import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> dsMatHang = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String MaMH = "MH0";
            if(i<10)
                MaMH += String.valueOf(0) + String.valueOf(i);
            else if(i<100)
                MaMH += String.valueOf(i);
            dsMatHang.add(new MatHang(MaMH,sc.nextLine(),sc.next(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(dsMatHang,new SortByLoiNhuan());
        for (MatHang x : dsMatHang) {
            x.in();
        }
    }
}

class SortByLoiNhuan implements Comparator<MatHang>{
    @Override
    public int compare(MatHang o1, MatHang o2) {
        if( o1.getLoiNhuan() > o2.getLoiNhuan())
            return -1;
        else if( o1.getLoiNhuan() < o2.getLoiNhuan())
            return 1;
        else 
            return o1.getMaMatHang().compareTo(o2.getMaMatHang());
    }
}
class MatHang{
    private String MaMatHang,TenMatHang,DonViTinh;
    private int GiaMua,GiaBan,LoiNhuan;
    MatHang(){}
    MatHang(String MaMH,String TenMatHang,String DonViTinh,int GiaMua,int GiaBan){
        this.MaMatHang = MaMH;
        this.TenMatHang = TenMatHang;
        this.DonViTinh = DonViTinh;
        this.GiaMua = GiaMua;
        this.GiaBan = GiaBan;
        this.LoiNhuan = GiaBan-GiaMua;
    }
    public int getLoiNhuan() {
        return LoiNhuan;
    }
    public String getMaMatHang() {
        return MaMatHang;
    }
    public void in(){
        System.out.printf("%s %s %s %d %d %d\n",this.MaMatHang,this.TenMatHang,this.DonViTinh,this.GiaMua,this.GiaBan,this.LoiNhuan);
    }
}
