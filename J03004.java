import java.util.Scanner;

public class J03004 
{
    public static StringBuilder chuanHoa(String s)
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
        return result;
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
            System.out.println(chuanHoa(s).toString().trim());
        }
    }
}
