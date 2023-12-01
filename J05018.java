import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class HocSinh implements Comparable<HocSinh>{
    private String id,name,type;
    private double tbc;

    HocSinh(Scanner sc){
        double [] diem = new double[10];
        double tbc = 0;
        sc.nextLine();
        this.name = sc.nextLine();
        for (int i = 0; i < 10; i++){ 
            diem[i] = sc.nextDouble();
            if ( i == 0 || i == 1)
                tbc += 2*diem[i];
            else tbc += diem[i];
        }
        this.tbc =(double) Math.round(tbc/12);
        if(this.tbc >= 8.95) this.type = "XUAT SAC";
        else if (this.tbc >=8) this.type = "GIOI";
        else if ( this.tbc >= 7) this.type = "KHA";
        else if ( this.tbc >=5) this.type = "TB";
        else this.type = "YEU";
    }

    public void setId(String id) {
        this.id = id;
    }
    public String toString(){
        return this.id+' '+this.name +' '+String.format("%.1f", this.tbc)+' '+this.type;
    }

    @Override
    public int compareTo(HocSinh o) {
        if(this.tbc > o.tbc) return -1;
        else if( this.tbc < o.tbc) return 1;
        else return this.id.compareTo(o.id);
    }


}

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<HocSinh> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            HocSinh tmp = new HocSinh(sc);
            String id = "HS";
            if(i<10) id += "0" + String.valueOf(i);
            else id += String.valueOf(i);
            tmp.setId(id);
            ds.add(tmp);
        }
        Collections.sort(ds);
        for (HocSinh i : ds) System.out.println(i);
    }
}
