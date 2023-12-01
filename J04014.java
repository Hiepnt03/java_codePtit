import java.math.BigInteger;
import java.util.Scanner;

class PhanSo{
    public BigInteger tu,mau;
    public static BigInteger gcd(BigInteger a,BigInteger b){
        return a.gcd(b);
    }
    PhanSo(){}
    PhanSo(BigInteger tu, BigInteger mau)
    {
        this.tu = tu;
        this.mau = mau;
    }
    String in(){
        return this.tu.toString() + "/" + this.mau.toString();
    }
    public static void rutgon(PhanSo p)
    {
        BigInteger tmp = gcd(p.tu,p.mau);
        p.tu = p.tu.divide(tmp);
        p.mau = p.mau.divide(tmp);
    }

    public PhanSo add(PhanSo p1, PhanSo p2)
    {
        rutgon(p1);
        rutgon(p2);
        PhanSo result = new PhanSo();
        result.tu = p1.tu.multiply(p2.mau).add(p2.tu.multiply(p1.mau));
        result.mau = p1.mau.multiply(p2.mau);
        rutgon(result);
        return result;
    }
    public PhanSo mutil(PhanSo p1, PhanSo p2){
        rutgon(p1);
        rutgon(p2);
        PhanSo result = new PhanSo();
        result.tu = p1.tu.multiply(p2.tu);
        result.mau = p1.mau.multiply(p2.mau);
        rutgon(result);
        return result;
    }
}
public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -->0) {
            PhanSo p1 = new PhanSo(new BigInteger(sc.next()), new BigInteger(sc.next()));
            PhanSo p2 = new PhanSo(new BigInteger(sc.next()), new BigInteger(sc.next()));
            
            PhanSo C = new PhanSo().add(p1, p2);
            C = new PhanSo().mutil(C, C);

            PhanSo D = new PhanSo().mutil(p1, p2);
            D = new PhanSo().mutil(C, D);

            System.out.println(C.in() + " "+ D.in());
        }
    }


}
