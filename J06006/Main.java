package J06006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> list_kh = new ArrayList<>();
        ArrayList<MatHang> list_mh = new ArrayList<>();
        ArrayList<HoaDon> list_hd = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n -- > 0)
            list_kh.add(new KhachHang(sc));

        int m = Integer.parseInt(sc.nextLine());
        while (m -- > 0)
            list_mh.add(new MatHang(sc));

        int k = Integer.parseInt(sc.nextLine());
        while (k-->0)
            list_hd.add(new HoaDon(list_kh,list_mh,sc));

        Collections.sort(list_hd);
        for(HoaDon i : list_hd)
            System.out.println(i);
    }
}
