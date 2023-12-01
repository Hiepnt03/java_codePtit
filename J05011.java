import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class GameThu implements Comparable<GameThu>{
    private String id, name;
    private String timme_in,time_out;
    private int gio,phut;

    GameThu(Scanner sc){
        this.id = sc.next();
        sc.nextLine();
        this.name = sc.nextLine();
        this.timme_in = sc.next();
        this.time_out = sc.next();
        settime();
    }

    public void settime() {
        this.gio = Integer.parseInt(this.time_out.substring(0,2 ))-Integer.parseInt(this.timme_in.substring(0,2 ));
        this.phut = Integer.parseInt(this.time_out.substring(3,5 ))-Integer.parseInt(this.timme_in.substring(3,5 ));
        if ( this.phut < 0 ){
            this.phut = 60 + this.phut;
            this.gio--;
        }
    }

    public String toString(){
        return id + " "+ this.name + " " + this.gio+ " gio " + this.phut +" phut";
    }

    @Override
    public int compareTo(GameThu o) {
        if( this.gio > o.gio ) return -1;
        else if ( this.gio < o.gio ) return 1;
        else{
            if( this.phut > o.phut ) return -1;
            else return 1;
        }
    }

}

public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<GameThu> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) 
            ds.add(new GameThu(sc));
        Collections.sort(ds);
        for (GameThu i : ds) {
            System.out.println(i);
        }
    }
}
