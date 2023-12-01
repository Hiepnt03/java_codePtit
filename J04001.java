import java.util.Scanner;

class Point{
    public double x,y;

    Point(){}
    Point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }

    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }

    double distance(Point p){
        return Math.sqrt( Math.pow(p.x-this.x,2) + Math.pow(p.y-this.y,2) );
    }
    double distance(Point p1, Point p2){
        return Math.sqrt( Math.pow(p1.x-p2.x,2) + Math.pow(p1.y-p2.y,2) );
    }

    public String toString(){
        return "Point(x,y): ("+this.x+','+this.y+')';
    }
}
public class J04001 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            double result = new Point().distance(p1, p2); 
            System.out.printf("%.4f\n",result);
        }
    }
}
