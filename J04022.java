import java.util.Scanner;
import java.util.TreeSet;

class WordSet{
    private TreeSet<String> datas = new TreeSet<>();

    WordSet(String s){
        String[] data = s.toLowerCase().split("\\s+");
        for (String i : data) this.datas.add(i);
    }

    public String union(WordSet p){
        TreeSet<String> datas = new TreeSet<>();
        for (String i : this.datas) datas.add(i);
        for (String i : p.datas) datas.add(i);
        String ans = "";
        for (String i : datas) 
            ans += i + " ";
        return ans;
    }

    public String intersection(WordSet p){
        TreeSet<String> datas = new TreeSet<>();
        for (String i : this.datas)
            for (String j : p.datas)
                if( i.equals(j) ){
                    datas.add(i);
                    break;
                }
        String ans = "";
        for (String i : datas) 
            ans += i + " ";
        return ans;
    }

}

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
