import java.util.ArrayList;
import java.util.Scanner;

public class J05024 {
    private static class SinhVien{
        private String id,name,clas,email;

        public SinhVien(String id, String name, String clas, String email) {
            this.id = id;
            this.name = name;
            this.clas = clas;
            this.email = email;
        }    
        
        @Override
        public String toString(){
            return this.id+' '+this.name+' '+this.clas+' '+this.email;
        }
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        int t = sc.nextInt(); sc.nextLine();
        while(t-->0){        
            ds.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q = sc.nextInt();
        while(q-->0){
            sc.nextLine();
            String nganh = sc.nextLine().toUpperCase();
            String datas[] = nganh.split("\\s+");
            String tmp = "";
            for (int i = 0; i < 2; i++) 
                tmp += datas[i].charAt(0);
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n",nganh);
            for(SinhVien i : ds)
                if(i.id.substring(5,7).equals(tmp))
                    System.out.println(i);
        }
    }
}
