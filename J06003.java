import java.util.ArrayList;
import java.util.Scanner;
class Student{
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
        return id+" "+name+" "+phone;
    }
}
class Group{
    private ArrayList<Student> ds;
    private String exercise;
    private int group;

    public Group(int group){
        this.group = group;
        this.exercise = "";
        ds = new ArrayList<>();
    }
    public void setExercise(Scanner sc) {
        this.exercise = sc.nextLine();
    }

    public void ADD(Student i){
        ds.add(i);
    }
    public void out(){
        System.out.printf("DANH SACH NHOM %d:\n",this.group);
        for (Student i : ds) 
            System.out.println(i);
        System.out.printf("Bai tap dang ky: %s\n",this.exercise);
    }
}
public class J06003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt(),m = sc.nextInt();
        sc.nextLine();

        Group [] groups = new Group[m];
        for (int i = 0; i < m; i++) 
            groups[i] = new Group(i+1);

        while(n-->0){
            Student tmp = new Student(sc);
            groups[tmp.getGroup()-1].ADD(tmp);
        }

        for (int i = 0; i < m; i++) 
            groups[i].setExercise(sc);

        int q = Integer.parseInt(sc.nextLine());
        while (q-->0) {
            int gr = Integer.parseInt(sc.nextLine());
            groups[gr-1].out();
        }
    }
}
