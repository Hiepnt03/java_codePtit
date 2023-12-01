import java.util.Scanner;
class So_Phuc{
    private int So_Thuc,So_Ao;
    So_Phuc(){}
    So_Phuc(int So_Thuc, int So_Ao){
        this.So_Thuc = So_Thuc;
        this.So_Ao = So_Ao;
    }
    public static So_Phuc add(So_Phuc A, So_Phuc B){
        return new So_Phuc(A.So_Thuc+B.So_Thuc, A.So_Ao+B.So_Ao);
    }
    public static So_Phuc multiply(So_Phuc A, So_Phuc B){
        return new So_Phuc(A.So_Thuc*B.So_Thuc - A.So_Ao*B.So_Ao, A.So_Thuc*B.So_Ao + A.So_Ao*B.So_Thuc);
    }
    public static void in(So_Phuc A, So_Phuc B){
        So_Phuc C = multiply(A, add(A, B));
        So_Phuc D = multiply(add(A, B), add(A, B));
        System.out.printf("%d + %di, %d + %di\n",C.So_Thuc,C.So_Ao,D.So_Thuc,D.So_Ao);
    }
}
public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            So_Phuc A = new So_Phuc(sc.nextInt(), sc.nextInt());
            So_Phuc B = new So_Phuc(sc.nextInt(), sc.nextInt());
            So_Phuc.in(A,B);
        }
    }
}
