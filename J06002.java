import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SanPham{
    private String id,name;
    private BigInteger cost_1,cost_2;

    public SanPham(Scanner sc){
        this.id = sc.nextLine();
        this.name = sc.nextLine();
        this.cost_1 = new BigInteger(sc.nextLine());
        this.cost_2 = new BigInteger(sc.nextLine());
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public BigInteger getCost_1() {
        return cost_1;
    }
    public BigInteger getCost_2() {
        return cost_2;
    }
}
class HoaDon implements Comparable<HoaDon>{
    private String id,name;
    private BigInteger number,total,sale;
    HoaDon(String id,BigInteger number){
        this.id = id;
        this.number = number;
        this.total = BigInteger.ZERO;
        this.sale = BigInteger.ZERO;
    }
    public String getId() {
        return id.substring(0, 2);
    }
    public void setall(SanPham i){
        this.name = i.getName();

        if(this.id.charAt(2) == '1')
            this.total = this.number.multiply(i.getCost_1());
        else
            this.total = this.number.multiply(i.getCost_2());

        if(this.number.compareTo(new BigInteger("150")) >= 0)
            this.sale = this.total.divide(new BigInteger("2"));
        else if(this.number.compareTo(new BigInteger("100")) >= 0)
            this.sale = this.total.divide(new BigInteger("100")).multiply(new BigInteger("30"));
        else if(this.number.compareTo(new BigInteger("50")) >= 0)
            this.sale = this.total.divide(new BigInteger("100")).multiply(new BigInteger("15"));
        else this.sale = BigInteger.ZERO;
    }
    @Override
    public int compareTo(HoaDon o) {
        if(this.total.subtract(this.sale).compareTo(o.total.subtract(o.sale)) > 0) 
            return -1;
        else
            return 1;
    }
    @Override
    public String toString() {
        return id+" "+name+" "+sale+" "+total.subtract(sale);
    }

}
public class J06002 {
    public static void main(String[] args) {
        int cnt = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> ds = new ArrayList<>();
        ArrayList<HoaDon> ds_hd = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n-->0) ds.add(new SanPham(sc));

        int q = Integer.parseInt(sc.nextLine());
        while (q -->0) {
            String datas [] = sc.nextLine().split("\\s+");
            String id = datas[0] + "-" + String.format("%03d", cnt++);
            BigInteger number = new BigInteger(datas[1]);
            ds_hd.add(new HoaDon(id, number));
        }

        for (HoaDon hoaDon : ds_hd) 
            for (SanPham sanPham : ds)
                if (hoaDon.getId().equals(sanPham.getId()))
                    hoaDon.setall(sanPham);
        
        Collections.sort(ds_hd);
        for (HoaDon i : ds_hd) 
            System.out.println(i);
    }
}
