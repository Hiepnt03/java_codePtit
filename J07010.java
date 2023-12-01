import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SinhVien{
    private String id,name,Class,birthday;
    private double gpa;
    private static int cnt=1;
    SinhVien(Scanner sc){
        this.id = "B20DCCN" + String.format("%03d",cnt++);
        this.name = sc.nextLine();
        this.Class = sc.nextLine();
        this.birthday = ChuanHoa(sc.nextLine());
        this.gpa = Double.parseDouble(sc.nextLine());
    }
    
    public String ChuanHoa(String birthday){
        if (birthday.charAt(2) != '/') birthday = "0" + birthday;
        if (birthday.charAt(5) != '/')
            return birthday.substring(0,3) + "0" + birthday.substring(3);
        return birthday;
    }
    
    public String toString() {
        return id +" "+name+" "+Class+" "+birthday+" "+String.format("%.2f",gpa);
    }

}

public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-->0) 
            System.out.println(new SinhVien(sc));
    }
}
