import java.math.BigInteger;
import java.util.Scanner;
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
        BigInteger tmp = gcd(this.tu,this.mau);
        this.tu = this.tu.divide(tmp);
        this.mau = this.mau.divide(tmp);
        String result = this.tu.toString() + "/" + this.mau.toString();
        return result;
    }
}
public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo s = new PhanSo(new BigInteger(sc.next()), new BigInteger(sc.next()));
        System.out.println(s.in());
    }    
}
