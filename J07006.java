import java.io.*;
import java.util.*;

public class J07006 {

    public static void main(String[] args) throws IOException {
        // Tạo một TreeMap<Integer, Integer> để lưu trữ các số khác nhau đã xuất hiện trong file
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Tạo một đối tượng DataInputStream trỏ đến file nhị phân
        FileInputStream fileInputStream = new FileInputStream("DATA.in");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        // Đọc từng số của file nhị phân
        while (true) {
            int number = dataInputStream.readInt();

            // Kiểm tra nếu đã hết giá trị
            if (number == -1) {
                break;
            }

            // Kiểm tra xem số hiện tại đã tồn tại trong TreeMap hay chưa
            Integer count = map.get(number);

            // Nếu số hiện tại chưa tồn tại trong TreeMap
            if (count == null) {
                // Thêm số hiện tại vào TreeMap và gán số lần xuất hiện của số hiện tại là 1
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
