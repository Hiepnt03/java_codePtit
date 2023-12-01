import java.math.BigInteger;
import java.util.Scanner;

public class J04004 {
    class PhanSo{
        private BigInteger tu,mau;
        BigInteger gcd(BigInteger a,BigInteger b){
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
        void rutgon(PhanSo p)
        {
            BigInteger tmp = gcd(p.tu,p.mau);
            p.tu = p.tu.divide(tmp);
            p.mau = p.mau.divide(tmp);
        }

        PhanSo add(PhanSo p1, PhanSo p2)
        {
            rutgon(p1);
            rutgon(p2);
            PhanSo result = new PhanSo();
            result.tu = p1.tu.multiply(p2.mau).add(p2.tu.multiply(p1.mau));
            result.mau = p1.mau.multiply(p2.mau);
            rutgon(result);
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p1 = new PhanSo(new BigInteger(sc.next()), new BigInteger(sc.next()));
        PhanSo p2 = new PhanSo(new BigInteger(sc.next()), new BigInteger(sc.next()));
        PhanSo result = new PhanSo();
        result = result.add(p1, p2);
        System.out.println(result.in());
    }
}
