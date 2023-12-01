import java.util.Scanner;
public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cd = sc.nextInt();
        int cr = sc.nextInt();
        if(cd<=0){
            System.out.println("0");
        }else if(cr<=0){
            System.out.println("0");
        }else{
            int cv = (cd+cr)*2;
            int dt = cd*cr;
            System.out.printf("%d ",cv);
            System.out.printf("%d",dt);
        }
        
    }
}
