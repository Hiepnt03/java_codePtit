import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien implements Comparable<SinhVien>{
    private String id,name,clas,birthday;
    private double gpa;
    SinhVien(){
        this.id = "";
        this.birthday = "";
        this.clas = "";
        this.name = "";
        this.gpa = 0;
    }
    SinhVien(String id,String name, String birthday, String clas, double gpa){
        this.id = id;
        this.birthday = CHuanHoaDay(birthday);
        this.clas = clas;
        this.name = ChuanHoaName(name);
        this.gpa = gpa;
    }

    public String CHuanHoaDay(String s){
        String []data = s.split("/");
        if(data[0].length()==1) data[0] = '0' + data[0];
        if(data[1].length()==1) data[1] = '0' + data[1];
        return data[0]+'/'+data[1]+'/'+data[2];
    }

    public String ChuanHoaName(String s){
        String tmp[] = s.toLowerCase().trim().split("\\s+");
        String ans = "";
        for (String i : tmp) 
            ans += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        return ans.trim();
    }

    public String toString(){
        return this.id+' '+this.name+' '+this.clas
                +' '+this.birthday+' '+String.format("%.2f",this.gpa);
    }

    public int compareTo(SinhVien o){
        if( this.gpa > o.gpa ) return -1;
        if ( this.gpa < o.gpa ) return 1;
        return this.id.compareTo(o.id);
    }
}

public class J05005 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String id = "";
            if(i<10)
                id = "B20DCCN00" + String.valueOf(i);
            else
                id = "B20DCCN0" + String.valueOf(i);
            String name = sc.nextLine();
            String clas = sc.next();
            String birtday = sc.next();
            double gpa = sc.nextDouble();
            SinhVien p = new SinhVien(id, name, birtday, clas, gpa);
            ds.add(p);
        }
        Collections.sort(ds);
        for(SinhVien i : ds) System.out.println(i);
    }  
}
