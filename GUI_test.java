import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_test {
    private JFrame frame;
    private JTextArea inputArea;
    private JTextArea outputArea;

    public GUI_test() {
        frame = new JFrame("Calculator App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        inputArea = new JTextArea(10, 30);
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        JButton calculateButton = new JButton("Tính");

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Đề bài: Tính chu vi và diện tích hình chữ nhật, tìm số lớn nhất trong dãy."));
        inputPanel.add(inputArea);
        inputPanel.add(calculateButton);

        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new FlowLayout());
        outputPanel.add(new JLabel("Kết quả:"));
        outputPanel.add(outputArea);

        frame.setLayout(new BorderLayout());
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(outputPanel, BorderLayout.CENTER);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    public void calculate() {
        String inputText = inputArea.getText();
        // Phân tích inputText để tình chu vi, diện tích và tìm số lớn nhất.
        // Code tính chu vi, diện tích và tìm số lớn nhất ở đây.

        // Sau khi tính toán, hiển thị kết quả trong outputArea.
        outputArea.setText("Kết quả tính chu vi, diện tích và số lớn nhất ở đây.");
    }

    public void display() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI_test calculatorApp = new GUI_test();
        calculatorApp.display();
    }
}
