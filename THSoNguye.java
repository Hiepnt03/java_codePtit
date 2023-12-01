import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

class IntSet{
    private TreeSet<Integer> my_set = new TreeSet<>();

    IntSet(){}
    IntSet(int[] ds){
        for (int i : ds) 
            this.my_set.add(i);
    }

    public void setMy_set(TreeSet<Integer> my_set) {
        this.my_set = my_set;
    }

    public IntSet union(IntSet p){
        TreeSet<Integer> my_set = new TreeSet<>();
        for (Integer i : this.my_set) my_set.add(i);
        for (Integer i : p.my_set) my_set.add(i);    
        IntSet ans = new IntSet();
        ans.setMy_set(my_set);
        return ans;
    }

    public IntSet intersection(IntSet p){
        TreeSet<Integer> my_set = new TreeSet<>();
        for (Integer i : this.my_set) 
            for (Integer j : p.my_set) {
                if(Objects.equals(i, j)) my_set.add(i);
                if( j > i ) break;
            }
           
        IntSet ans = new IntSet();
        ans.setMy_set(my_set);
        return ans;
    }

    public static void tru(IntSet A, IntSet B){
        TreeSet <Integer> list = A.intersection(B).getMy_set();
        for (Integer i : A.getMy_set()) 
            if( !list.contains(i) )
                System.out.printf("%d ",i);
            
        System.out.println();
        for (Integer i : B.getMy_set()) 
            if( !list.contains(i) )
                System.out.printf("%d ",i);
        System.out.println();
    }

    public TreeSet<Integer> getMy_set() {
        return my_set;
    }

    public String toString(){
        String result = "";
        for (Integer i : this.my_set) {
            result += String.valueOf(i) + " ";
        }
        return result;
    }
}


public class THSoNguye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
        IntSet.tru(s1, s2);
    }
}
