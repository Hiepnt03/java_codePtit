import java.util.Scanner;

class DaThuc{
    private int bac;
    private int heso[] = new int[10000];

    // DaThuc(){
    //     this.bac = 0;
    //     this.heso = new int[1];
    // }
    DaThuc(String s){
        String [] data = s.trim().split("\\s+");
        for (String i : data) {
            String tmp[] = i.split("*^x");
            this.heso[Integer.parseInt(tmp[1])] = Integer.parseInt(tmp[0]);
        }
        // String[] tmp1 = data[0].split("*x^");
        // this.bac = Integer.parseInt(tmp1[1]);
        // int heso[] = new int[10000];
        // for (String i : data) {
        //     if(i.equals("+"))
        //         break;
        //     String[] tmp = i.split("*x^");
        //     heso[Integer.parseInt(tmp[1])] = Integer.parseInt(tmp[0]);
        // }
        // this.heso = heso;
    }
 
    // public DaThuc cong(DaThuc q){
    //     DaThuc ans = new DaThuc();
    //     ans.bac = Math.max(this.bac, q.bac);
    //     for (int i = 0; i < 10000; i++) 
    //         ans.heso[i] = this.heso[i] + q.heso[i];
    //     return ans;
    // }

    public String toString(){
        // String ans = "";
        // for (int i = 0; i < 10000; i++){
        //     if( heso[i] == 0)
        //         break;
        //     ans += String.valueOf(heso[i]) + "*x^" + String.valueOf(i);
        // }
        // return ans;
        String ans = "";
        for (Integer i=0; i<heso.length; i++)
        {
            if( heso[i] == 0) break;
            ans += String.valueOf(heso[i]) + "*x^" + String.valueOf(i) +" ";
        }
        return ans;
    }
}

public class J05063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            DaThuc p = new DaThuc(sc.nextLine());
            System.out.println(p);
        }
    }
}
