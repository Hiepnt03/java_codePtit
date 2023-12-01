import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MatHang implements Comparable<MatHang>{
    private String name,group;
    private double purchase_price,price,profit;
    private int id;

    MatHang(Scanner sc){
        sc.nextLine();
        this.name = sc.nextLine();
        this.group = sc.nextLine();
        this.purchase_price = sc.nextDouble();
        this.price = sc.nextDouble();
        this.profit = price - purchase_price;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getSum() {
        return profit;
    }

    public String toString(){
        return String.valueOf(id) + " "+ this.name + " " 
            + this.group + " " + String.format("%.2f",this.profit);
    }

    @Override
    public int compareTo(MatHang o) {
        if( this.profit > o.profit ) return -1;
        else return 1;
    }

}

public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            MatHang tmp = new MatHang(sc);
            tmp.setId(i);
            ds.add(tmp);
        }
        Collections.sort(ds);
        for (MatHang i : ds) {
            System.out.println(i);
        }
    }
}
