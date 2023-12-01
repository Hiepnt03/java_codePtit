import java.util.Scanner;

public class J03005 
{
    public static String chuan_hoa_ho_ten(String s)
    {
        s=s.toLowerCase().trim();
        String [] datas = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String i : datas) 
        {
            char [] tmp = i.toCharArray();
            tmp[0] = Character.toUpperCase(tmp[0]);
            result.append(tmp);
            result.append(" ");
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
    public static String chuan_hoa_ten_ho(String s)
    {
        String [] datas = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < datas.length; i++) {
            result.append(datas[i]);
            result.append(" ");
        }
        result.deleteCharAt(result.length()-1);
        result.append(", ");
        result.append(datas[0].toUpperCase());
        return result.toString();
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            t--;
            String s = sc.nextLine();
            s = chuan_hoa_ho_ten(s);
            s = chuan_hoa_ten_ho(s);
            System.out.println(s);
        }
    }
}
