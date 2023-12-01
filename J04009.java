import java.util.Scanner;

public class J04009 {
    class Point{
        private double x,y;
        Point(){}
        Point(double x, double y)
        {
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        public double distance(Point p1, Point p2){
            return Math.sqrt( Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2) );
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
            double d1 = new Point().distance(p1,p2);
            double d2 = new Point().distance(p1,p3);
            double d3 = new Point().distance(p2,p3);
            if( d1 + d2 <= d3 || d1 + d3 <= d2 || d2 + d3 <= d1) 
                System.out.println("INVALID");
            else
            {
                double tmp = Math.sqrt((d1+d2+d3)*(d1+d2-d3)*(-d1+d2+d3)*(d1-d2+d3));
                System.out.printf("%.2f\n",tmp/4);
            }
        }
    }
}
