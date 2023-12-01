import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MonHoc> list_MH = new ArrayList<>();
        ArrayList<GiangVien> list_Gv = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n-->0)
            list_MH.add(new MonHoc(sc));

        int m = Integer.parseInt(sc.nextLine());
        while (m-->0)
            list_Gv.add(new GiangVien(sc));

        int k = Integer.parseInt(sc.nextLine());
        while (k-->0){
            String datas [] = sc.nextLine().split("\\s+");
            for(GiangVien i : list_Gv)
                if (datas[0].equals(i.getMaGV()))
                    i.TinhGioChuan(Double.parseDouble(datas[2]));
        }

        for(GiangVien i : list_Gv)
            System.out.println(i);
    }
}
