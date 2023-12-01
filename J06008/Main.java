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

            String TenMH="";
            for (MonHoc i : list_MH)
                if (datas[1].equals(i.getMaMH())){
                    TenMH = i.getTenMH() + " " + datas[2];
                    break;
                }

            for(GiangVien i : list_Gv)
                if (datas[0].equals(i.getMaGV()))
                    i.TinhGioChuan(TenMH,Double.parseDouble(datas[2]));
        }

        String question = sc.nextLine();
        for(GiangVien i : list_Gv)
            if (question.equals(i.getMaGV()))
                System.out.println(i);
    }
}
