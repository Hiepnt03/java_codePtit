import java.text.DecimalFormat;
import java.util.Scanner;
class Point{
    private double x,y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc){
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return new Point(x, y);
    }
    
    public static double KhoangCach(Point p1, Point p2){
        return Math.sqrt( (p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y) );
    }
}

class Triangle{
    private Point A, B, C;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public boolean valid() {
        double d1 = Point.KhoangCach(A, B);
        double d2 = Point.KhoangCach(A, C);
        double d3 = Point.KhoangCach(B, C);
        if ( d1 + d2 <= d3 || d1 + d3 <= d2 || d2 + d3 <= d1 )
            return false;
        return true;
    }

    public String getPerimeter() {
        double d1 = Point.KhoangCach(A, B);
        double d2 = Point.KhoangCach(A, C);
        double d3 = Point.KhoangCach(B, C);
        String result = new DecimalFormat("#.###").format(d1+d2+d3);
        return result;
    }
}


public class J04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
