import java.util.Scanner;
public class J03006 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            String s = sc.next();
            if(checksodep(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
    public static boolean checksodep(String s)
    {   
        for(int i=0; i<s.length(); i++)
        {
            if( (s.charAt(i) - '0') % 2 == 1){
                return false;
            }
        }
        for(int i=0; i<s.length()/2; i++)
        {
            if( (s.charAt(i) - '0') != (s.charAt(s.length()-1-i) - '0') ){
                return false;
            }
        }
        return true;
    }
}
