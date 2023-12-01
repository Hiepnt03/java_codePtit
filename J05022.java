import java.util.ArrayList;
import java.util.Scanner;

class SinhVien{
    private String id,name,classs,mail;

    SinhVien(Scanner sc){
        this.id = sc.next();
        sc.nextLine();
        this.name = sc.nextLine();
        this.classs = sc.next();
        this.mail = sc.next();
    }

    public String getClasss() {
        return classs;
    }

    public String toString(){
        return this.id+" "+this.name+" " + this.classs+" "+this.mail;
    }

}

public class J05022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<SinhVien> ds = new ArrayList<>();
        while (n-->0) 
            ds.add(new SinhVien(sc));
            
        sc.nextLine();
        int q = sc.nextInt();

        while (q-->0) {
            String classs = sc.next();
            ArrayList<SinhVien> ans = new ArrayList<>();
            for (SinhVien i : ds) 
                if( classs.equals(i.getClasss()))
                    ans.add(i);
            if(ans.size()>0){
                System.out.println("DANH SACH SINH VIEN LOP "+classs+":");
                for (SinhVien i : ans) System.out.println(i);
            }
        }
    }
}
