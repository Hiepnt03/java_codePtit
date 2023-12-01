import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) {
        // Đường dẫn đến file DATA.in
        String filePath = "DATA.in";

        try {
            // Tạo đối tượng File từ đường dẫn
            File file = new File(filePath);

            // Tạo đối tượng Scanner để đọc file
            Scanner scanner = new Scanner(file);

            // Đọc và in nội dung từ file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Đóng file sau khi đọc xong
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Không thể tìm thấy file: " + filePath);
        }
    }
}
