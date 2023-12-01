import java.util.Scanner;

class SinhVien{
    private String id,name;
    private double toan,ly,hoa;
    SinhVien(){}
    SinhVien(String id, String name, double toan, double ly, double hoa){
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.hoa = hoa;
        this.ly = ly;
    }

    public String getId() {
        return id;
    }

    public double Uutien() {
        String s = this.getId();
        String tmp = s.substring(0,3);
        double ans = 0;
        if( tmp.equals("KV1"))
            ans = 0.5;
        if( tmp.equals("KV2"))
            ans = 1.0;
        if( tmp.equals("KV3"))
            ans = 1.5;
        return ans;
    }

    public double getToan() {
        return toan;
    }

    public double getLy() {
        return ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void in() {
        double tong = 2*this.getToan()+this.getLy()+this.getHoa();
        double uutien = this.Uutien();
        String kq = "";
        if( tong + uutien >= 24 ) kq = "TRUNG TUYEN";
        else kq = "TRUOT";
        if (uutien == (int)uutien && tong == (int)tong)
            System.out.printf("%s %s %.0f %.0f %s\n",this.id,this.name,uutien,tong,kq);
        else if (uutien == (int)uutien)
            System.out.printf("%s %s %.0f %.1f %s\n",this.id,this.name,uutien,tong,kq);
        else if (tong == (int)tong)
            System.out.printf("%s %s %.1f %.0f %s\n",this.id,this.name,uutien,tong,kq);
        else
            System.out.printf("%s %s %.1f %.1f %s\n",this.id,this.name,uutien,tong,kq);  
    }
}
public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        SinhVien p = new SinhVien(id, name, toan, ly, hoa);
        p.in();
    }
}
