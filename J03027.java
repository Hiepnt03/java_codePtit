
import java.util.Scanner;
import java.util.Stack;

public class J03027 {
    // Hàm xóa các kí tự giống nhau liền nhau trong xâu
    public static String removeDuplicates(String s) {
        // Tạo một ngăn xếp để lưu trữ các kí tự
        Stack<Character> stack = new Stack<>();
        // Duyệt qua các kí tự của xâu
        for (int i = 0; i < s.length(); i++) {
            // Lấy kí tự hiện tại
            char c = s.charAt(i);
            // Nếu ngăn xếp không rỗng và kí tự hiện tại giống với kí tự ở đỉnh ngăn xếp
            if (!stack.isEmpty() && c == stack.peek()) 
                // Xóa kí tự ở đỉnh ngăn xếp
                stack.pop();
            else 
                // Thêm kí tự hiện tại vào ngăn xếp
                stack.push(c);
        }
        // Tạo một biến để lưu kết quả
        StringBuilder result = new StringBuilder();
        // Lấy các kí tự từ ngăn xếp và thêm vào kết quả theo thứ tự ngược lại
        while (!stack.isEmpty())
            result.insert(0, stack.pop());
        // Trả về kết quả dưới dạng xâu
        return result.toString();
    }

    // Hàm chính để kiểm tra
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập xâu S
        String s = sc.nextLine();
        // Gọi hàm xóa các kí tự giống nhau liền nhau trong xâu
        String result = removeDuplicates(s);
        // In ra kết quả
        if (result.isEmpty())   
            System.out.println("Empty String");
        else    
            System.out.println(result);
    }
}