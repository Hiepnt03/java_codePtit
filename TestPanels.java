import java.awt.*;
import javax.swing.*;

public class TestPanels{
  public TestPanels(){
    JPanel p1 = new JPanel();// tạo 1 buttom
    p1.setLayout(new GridLayout(4,3));// chia buttom thành 4 hàng, 3 cột
    for (int i = 1; i <= 9; i++) 
      p1.add(new Button(String.valueOf(i)));
    p1.add(new Button("0"));
    p1.add(new Button("Start"));
    p1.add(new Button("Cancel"));

    JPanel p2 = new JPanel();
    p2.add(new Button("result"));
    
  }
}
