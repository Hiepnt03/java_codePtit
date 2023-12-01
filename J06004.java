import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String id,name,phone;
    private int group;
    public Student(Scanner sc){
        this.id = sc.nextLine();
        this.name = sc.nextLine();
        this.phone = sc.nextLine();
        this.group = Integer.parseInt(sc.nextLine());
    }
    public int getGroup() {
        return group;
    }
    @Override
    public String toString() {
        return id+" "+name+" "+phone+" "+String.valueOf(group)+ " ";
    }
    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}

public class J06004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Student> ds = new ArrayList<>();
        int n=sc.nextInt(),m = sc.nextInt();
        sc.nextLine();

        while(n-->0) ds.add(new Student(sc));

        String[] excercise = new String[m];
        for (int i = 0; i < m; i++) 
            excercise[i] = sc.nextLine();

        Collections.sort(ds);
        for (Student i : ds)        
            System.out.println(i+excercise[i.getGroup()-1]);
    }
}
