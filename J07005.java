import java.io.*;
import java.util.*;

public class J07005 {

    public static void main(String[] args) throws IOException {
        // Tạo một HashMap<Integer, Integer> để lưu trữ các số khác nhau đã xuất hiện trong file
        HashMap<Integer, Integer> map = new HashMap<>();

        // Tạo một đối tượng DataInputStream trỏ đến file nhị phân
        FileInputStream fileInputStream = new FileInputStream("DATA.IN");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        // Đọc từng số của file nhị phân
        for (int i = 0; i < 100000; i++) {
            int number = dataInputStream.readInt();

            // Kiểm tra xem số hiện tại đã tồn tại trong HashMap hay chưa
            Integer count = map.get(number);

            // Nếu số hiện tại chưa tồn tại trong HashMap
            if (count == null) {
                // Thêm số hiện tại vào HashMap và gán số lần xuất hiện của số hiện tại là 1
                map.put(number, 1);
            } else {
                // Tăng số lần xuất hiện của số hiện tại lên 1
                map.put(number, count + 1);
            }
        }

        // Đóng file
        fileInputStream.close();
        dataInputStream.close();

        // In ra các số khác nhau và số lần xuất hiện của từng số đó theo thứ tự tăng dần
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
