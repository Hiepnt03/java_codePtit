import java.util.Scanner;

class Matrix{
    private int n,m;
    private int [][] arr = new int[50][50];

    Matrix(int n, int m){
        this.n = n;
        this.m = m;
    }
    public void nextMatrix(Scanner sc){
        for (int i = 0; i < this.n; i++) 
            for (int j = 0; j < this.m; j++) 
                this.arr[i][j] = sc.nextInt();
    }

    public Matrix mul(Matrix p){
        Matrix ans = new Matrix(this.n, p.m);
        int tmp = 0;
        for (int i = 0; i < ans.n; i++) 
            for (int j = 0; j <ans.m; j++) {
                for (int k = 0; k < this.m; k++) 
                    ans.arr[i][j] += this.arr[i][k] * p.arr[k][j];
            }
            
        return ans;
    }

    public String toString(){
        String ans = "";
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) 
                ans += this.arr[i][j] +" ";
            ans += "\n";
        }
        return ans;
    }
}

public class J04016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
