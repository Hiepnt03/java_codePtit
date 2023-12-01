import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {

    public static void ChuanHoa(String name){
        String datas[] = name.toLowerCase().trim().split("\\s+");
        for (String data : datas) 
            System.out.printf("%s%s ",Character.toUpperCase(data.charAt(0)),data.substring(1));
        System.out.println();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String data = sc.nextLine();
            if(data.equals("END"))
                break;
            ChuanHoa(data);
        }
    }
}
