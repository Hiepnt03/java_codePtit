package J06006;

import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon implements Comparable<HoaDon> {
    private String MaHD;
    private KhachHang kh;
    private MatHang mh;
    private long SoLuong,ThanhTien,LoiNhuan;
    static int sttHD = 1;
    public HoaDon(ArrayList<KhachHang> list_kh, ArrayList<MatHang> list_mh, Scanner sc) {
        this.MaHD = String.format("HD%03d",sttHD++);
        String [] datas = sc.nextLine().split("\\s+");
        String maKH = datas[0];
        FindKH(maKH,list_kh);
        String maMH = datas[1];
        FindMH(maMH,list_mh);
        this.SoLuong = Integer.parseInt(datas[2]);
        this.ThanhTien = this.SoLuong*this.mh.getGiaBan();
        this.LoiNhuan  = this.ThanhTien - this.SoLuong*this.mh.getGiaMua();
    }
    private void FindKH(String maKH, ArrayList<KhachHang> list_kh){
        for(KhachHang i : list_kh )
            if (maKH.equals(i.getMaKH())) {
                this.kh = i;
                return;
            }
    }
    private void FindMH(String maMH, ArrayList<MatHang> list_mh){
        for(MatHang i : list_mh )
            if (maMH.equals(i.getMaMH())) {
                this.mh = i;
                return;
            }
    }

    @Override
    public String toString() {
        return this.MaHD + " " + this.kh.getTenKH() + " " + this.kh.getDiaChi() + " "
                + this.mh.getTenMH() + " " + String.valueOf(this.SoLuong) + " "
                + String.valueOf(this.ThanhTien) + " " + String.valueOf(this.LoiNhuan);
    }

    @Override
    public int compareTo(HoaDon o) {
        if(this.LoiNhuan > o.LoiNhuan)
            return -1;
        else return 1;
    }
}
