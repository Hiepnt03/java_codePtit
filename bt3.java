import java.util.Scanner;

public class bt3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int max = finded(s);
            System.out.println(max);
        }
    }
    public static int finded(String s){
        int maxx = 0;
        int currrent = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                currrent++;
            }else{
                maxx = Math.max(maxx,currrent);
                currrent = 0;
            }
        }
        return Math.max(maxx, currrent);
    }
}