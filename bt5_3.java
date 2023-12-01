import java.util.Scanner;
import java.util.Stack;

public class bt5_3 {
    public static long TinhToan(String s){
        String tokens [] = s.split(" ");
        Stack<Long> stack = new Stack<>();

        for(int i = tokens.length - 1; i >= 0; i--){
            String token = tokens[i];
            if (isNumeric(token)) 
                stack.push(Long.parseLong(token));
            else{
                long a = stack.pop(), b= stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static boolean isNumeric(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            System.out.println(TinhToan(s));
        }
    }
}
