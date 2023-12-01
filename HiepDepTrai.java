import java.util.*;

public class HiepDepTrai {

    private List<List<Integer>> adjList;
    private boolean[] visited;
    private boolean[] recStack;

    public HiepDepTrai(int n) {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        visited = new boolean[n];
        recStack = new boolean[n];
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
    }

    public boolean dfs(int v) {
        visited[v] = true;
        recStack[v] = true;

        for (int neighbor : adjList.get(v)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor)) {
                    return true;
                }
            } else if (recStack[neighbor]) {
                return true;
            }
        }

        recStack[v] = false;
        return false;
    }

    public boolean isCyclic() {
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                if (dfs(i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HiepDepTrai HiepDepTrai = new HiepDepTrai(n);

        for (int i = 0; i < n; i++) {
            String name1 = sc.next();
            String sign = sc.next();
            String name2 = sc.next();

            if (sign.equals(">")) {
                HiepDepTrai.addEdge(name1, name2);
            } else {
                HiepDepTrai.addEdge(name2, name1);
            }
        }

        if (HiepDepTrai.isCyclic()) {
            System.out.println("impossible");
        } else {
            System.out.println("possible");
        }
    }
}
