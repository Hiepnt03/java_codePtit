import java.util.Scanner;
class ThiSinh{
    private String HoTen,NgaySinh;
    private float diem1,diem2,diem3,tong;
    ThiSinh(){}
    ThiSinh(String HoTen,String NgaySinh,float diem1,float diem2,float diem3)
    {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        tong = diem1 + diem2 + diem3;
    }
    void in(){
        System.out.printf("%s %s %.1f\n",HoTen,NgaySinh,tong);
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh data = new ThiSinh(sc.nextLine(), sc.next(),sc.nextFloat(),sc.nextFloat(), sc.nextFloat());
        data.in();
    }
}
