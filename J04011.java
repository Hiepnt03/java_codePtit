import java.util.Scanner;

class Point3D {
    private int x, y, z;

    Point3D() {}

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Point3D vector(Point3D p1, Point3D p2) {
        Point3D result = new Point3D();
        result.x = p2.x - p1.x;
        result.y = p2.y - p1.y;
        result.z = p2.z - p1.z;
        return result;
    }
    // tích có hướng của vector a và vector b
    public static Point3D crossProduct(Point3D a, Point3D b) {
        Point3D result = new Point3D();
        result.x = a.y * b.z - a.z * b.y;
        result.y = a.z * b.x - a.x * b.z;
        result.z = a.x * b.y - a.y * b.x;
        return result;
    }
    // tích vô hướng của vector a và vector b
    public static int dotProduct(Point3D a, Point3D b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    public static boolean check(Point3D A, Point3D B, Point3D C, Point3D D) {
        Point3D vector_AB = vector(A, B);
        Point3D vector_AC = vector(A, C);
        Point3D vector_AD = vector(A, D);
        Point3D crossProduct = crossProduct(vector_AC, vector_AD);
        int result = dotProduct(vector_AB, crossProduct);
        return result == 0;
    }
}

public class J04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (Point3D.check(p1, p2, p3, p4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
