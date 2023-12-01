import java.util.Scanner;

class Matrix{
    private int n,m;
    private int [][] arr ;

    Matrix(int n, int m){
        this.n = n;
        this.m = m;
        this.arr = new int [n][m];
    }
    public void nextMatrix(Scanner sc){
        for (int i = 0; i < this.n; i++) 
            for (int j = 0; j < this.m; j++) 
                this.arr[i][j] = sc.nextInt();
    }

    public Matrix trans(){
        Matrix p = new Matrix(this.m, this.n);
        for (int i = 0; i < this.n; i++) 
            for (int j = 0; j < this.m; j++) 
                p.arr[j][i]  = this.arr[i][j];
        return p;
    }

    public Matrix mul(Matrix p){
        Matrix ans = new Matrix(this.n, p.m);
        for (int i = 0; i < ans.n; i++) 
            for (int j = 0; j <ans.m; j++) {
                for (int k = 0; k < this.m; k++) 
                    ans.arr[i][j] += this.arr[i][k] * p.arr[k][j];
            }
            
        return ans;
    }

    @Override
    public String toString(){
        String ans = "";
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) 
                ans += String.valueOf(this.arr[i][j]) +" ";
            if(i<this.n-1) ans += "\n";
        }
        return ans;
    }
}

public class J04017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}
