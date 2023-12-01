import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{
    private String id,name,type;
    MonHoc(String id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String toString(){
        return this.id + ' ' + this.name +' '+this.type; 
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.id.compareTo(o.id);
    }

}

public class dsmonthi {
    public static void main(String[] args) throws IOException {
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        ArrayList <MonHoc> ds = new ArrayList<>();
        while(sc.hasNextLine()){
            int ok = 1;
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            for (MonHoc i : ds) 
                if ( id.equals(i.getId())) {
                    ok = 0; 
                    break;
                }
            if( ok == 1){
                MonHoc tmp = new MonHoc(id, name, type);
                ds.add(tmp);
            }
        }
        Collections.sort(ds);
        for (MonHoc i : ds) System.out.println(i);
    }
}
