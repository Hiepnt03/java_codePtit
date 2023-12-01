import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class THIETLAPDIACHIEMAIL {
    public static ArrayList<String> ds = new ArrayList<>();
  
    public static void ChuanHoaHoTen(String s){
        String [] datas = s.trim().toLowerCase().split("\\s+");
        String ans = "";
        for (int i = 0; i < datas.length; i++) {
            if(i==datas.length-1)
                ans = datas[datas.length-1] + ans;
            else
                ans += datas[i].charAt(0);
        }
        while (true) {
            int tmp1 = ds.size();
            ds.add(ans);
            int tmp2 = ds.size();
            if(tmp1 != tmp2) break;
            else{
                
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        while (sc.hasNextLine()) 
            ChuanHoaHoTen(sc.nextLine());
    }
}
