import java.util.Scanner;

class Rectange{
    public double width,height;
    public String color;
    String ChuanHoaColor(String color){
        color = color.toLowerCase();
        return Character.toUpperCase(color.charAt(0))+color.substring(1);
        // color.substring(index) : trích xuất xâu s từ vị trí index đến hết
    }
    Rectange(){
        this.width = 1;
        this.height = 1;
    }
    Rectange(double width, double height,String color)
    {
        this.width = width;
        this.height = height;
        this.color = ChuanHoaColor(color);
    }
    double getWidth() {
        return this.width;
    }
    void setWidth(double width) {
        this.width = width;
    }
    double getHeight() {
        return this.height;
    }
    void setHeight(double height) {
        this.height = height;
    }
    String getColor() {
        return this.color;
    }
    void setColor(String color) {
        this.color = ChuanHoaColor(color);
    }
    double findArea(){
        return this.width*this.height;
    }
    double findPerimeter(){
        return 2*(this.width+this.height);
    }
}
public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange hcn = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
        if(hcn.getHeight() != (int)hcn.getHeight() || hcn.getWidth()!= (int)hcn.getWidth()||hcn.getWidth()<=0||hcn.getHeight()<=0)            
            System.out.println("INVALID");
        else
            System.out.printf("%.0f %.0f %s\n",hcn.findPerimeter(),hcn.findArea(),hcn.getColor());
    }
}
