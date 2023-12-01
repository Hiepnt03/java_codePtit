import java.io.File;
import java.util.Scanner;

class SinhVien{
    private String name,birthday,id,classs;
    private float gpa;

    public SinhVien(String name, String classs, String birthday, float gpa) {
        this.id = "B20DCCN001";
        this.name = name;
        this.classs = classs;
        this.birthday = standardizationOfBirthDate(birthday);        
        this.gpa = gpa;
    }
    
    static String standardizationOfBirthDate(String birthday){
        String []s = birthday.split("/");
        if(s[0].length()==1) s[0] = '0' + s[0];
        if(s[1].length()==1) s[1] = '0' + s[1];
        return s[0]+'/'+s[1]+'/'+s[2];
    }
    
    void inThongTin(){
        System.out.printf("%s %s %s %s %.2f\n",
                this.id,this.name,this.classs,this.birthday,this.gpa);
    }

    public File getId() {
        return null;
    }
}
public class J04006 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        SinhVein n = new SinhVein(sc.nextLine(),sc.next(),sc.next(),sc.nextFloat());
        n.inThongTin();
    }
}
