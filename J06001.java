import java.math.BigInteger;
import java.util.ArrayList;
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
    public void HoaDon(String id, int number){
        BigInteger cost = BigInteger.ZERO;
        if (id.charAt(2) == '1') cost = this.cost_1;
        else cost = this.cost_2;
        BigInteger total = cost.multiply(new BigInteger(String.valueOf(number)));
        if(number >= 150)
            System.out.println(id+" "+this.name+" "+total.divide(new BigInteger("2"))+" "+total.divide(new BigInteger("2")));
        else if(number >= 100)
            System.out.println(id+" "+this.name+" "+total.divide(new BigInteger("10")).multiply(new BigInteger("3"))
                            +" "+total.divide(new BigInteger("10")).multiply(new BigInteger("7")));
        else if(number >= 50)
            System.out.println(id+" "+this.name+" "+total.divide(new BigInteger("100")).multiply(new BigInteger("15"))
                            +" "+total.divide(new BigInteger("100")).multiply(new BigInteger("85")));
        else
            System.out.println(id+" "+this.name+" "+BigInteger.ZERO+" "+total);
    }
}

public class J06001 {
    public static void main(String[] args) {
        int cnt = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> ds = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n-->0) ds.add(new SanPham(sc));

        int q = Integer.parseInt(sc.nextLine());
        while (q -->0) {
            String datas [] = sc.nextLine().split("\\s+");
            String id = datas[0] + "-" + String.format("%03d", cnt++);
            int number = Integer.parseInt(datas[1]);
            for (SanPham i : ds)               
                if(id.substring(0, 2).equals(i.getId())){
                    i.HoaDon(id, number);
                    break;
                }
        }
    }
}
