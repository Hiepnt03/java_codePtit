import java.util.Scanner;

public class J04008 {
    class Point{
        private double x,y;
        Point(){}
        Point(double x, double y)
        {
            this.x = x;
            this.y = y;
        }
        Point(Point p){
            this.x = p.x;
            this.y = p.y;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        double distance(Point p){
            return Math.sqrt( Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2) );
        }
        double distance(Point p1, Point p2){
            return Math.sqrt( Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2) );
        }
        public String toString(){
            return "Point(x,y): ("+this.x+','+this.y+')';
        }
        double chuvi(Point p1, Point p2, Point p3){
            return distance(p1, p2) + distance(p1, p3) + distance(p2, p3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            t--;
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            double d1 = new Point().distance(p1, p2);
            double d2 = new Point().distance(p1, p3);
            double d3 = new Point().distance(p2, p3);
            if( d1 + d2 <= d3 || d1 + d3 <= d2 || d2 + d3 <= d1) 
                System.out.println("INVALID");
            else
                System.out.printf("%.3f\n",d1+d2+d3);
        }
    }
}
