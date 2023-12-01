import java.util.Scanner;

public class J01010 {
    public static String cut(String s){
        /*
        Số 0 cắt đôi vẫn ra số 0
        Số 1 cắt đôi vẫn ra số 1
        Số 8 cắt đôi ra số 0
        Số 9 cắt đôi ra số 0
        Các số khác cắt đôi sẽ không hợp lệ
        */
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) - '0' == 0 || s.charAt(i) - '0' == 8 || s.charAt(i) - '0' == 9 )
                result += '0';
            else if(s.charAt(i) - '0' == 1)
                result += '1';
            else 
                return "INVALID";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            String s = sc.nextLine();
            String ans = cut(s);
            if(ans.equals("INVALID"))
                System.out.println("INVALID");
            else{
                long ans_number = Long.parseLong(ans);
                if(ans_number == 0)
                    System.out.println("INVALID");
                else
                    System.out.println(ans_number);
            }
        }
    }
}
