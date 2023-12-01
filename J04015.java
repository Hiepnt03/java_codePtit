import java.math.BigInteger;
import java.util.Scanner;
class teacher{
    public String id,full_name;
    public BigInteger basic_salary;
    teacher(){}
    teacher(String id,String full_name, BigInteger basic_salary)
    {
        this.id = id;
        this.full_name = full_name;
        this.basic_salary = basic_salary;
    }
    void information()
    {
        int subsidies_salary = 0;
        BigInteger coefficient = new BigInteger(this.id.substring(2,4));
        if( this.id.charAt(0) == 'H' && this.id.charAt(1) == 'T') 
            subsidies_salary = 2000000;
        if( this.id.charAt(0) == 'H' && this.id.charAt(1) == 'P') 
            subsidies_salary = 900000;
        if( this.id.charAt(0) == 'G' && this.id.charAt(1) == 'V' ) 
            subsidies_salary = 500000;
        BigInteger salary = this.basic_salary.multiply(coefficient).add(new BigInteger(String.valueOf(subsidies_salary)));
        System.out.printf("%s %s %d %d %d\n",this.id,this.full_name,coefficient,subsidies_salary,salary);
    }
}
public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        teacher A = new teacher(sc.nextLine(), sc.nextLine(),new BigInteger(sc.nextLine()));
        A.information();
    }
}
