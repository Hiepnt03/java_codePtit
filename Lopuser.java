import java.util.Scanner;

class user{
    private String username,password;

    user(Scanner sc){
        this.username = sc.next();
        this.password = sc.next();
    }

    public boolean check(String username, String password){
        if( username.equals(this.username) && password.equals(this.password))
            return true;
        return false;

    }

}

public class Lopuser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        user [] ds = new user[n];
        int ans [ ] = new int[n];
        for (int i = 0; i < n; i++) 
            ds[i] = new user(sc);
            
        sc.nextLine();
        int q = sc.nextInt();

        while (q-->0) {
            sc.nextLine();
            String user =sc.next();
            String pass = sc.next();
            for (int i = 0; i < n; i++) 
                if( ds[i].check(user, pass) )
                    ans[i]++;
        }
        for (int i = 0; i < n; i++) 
            System.out.printf("%d ",ans[i]);
    }
}
