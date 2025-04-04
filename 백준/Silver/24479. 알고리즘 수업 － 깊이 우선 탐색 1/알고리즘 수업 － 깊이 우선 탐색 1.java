import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    HashMap<Integer, List<Integer>> graph = new HashMap<>();
    boolean[] visited;
    int[] order;
    int n, m, v, count = 1;

    void setting() throws IOException {
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        v = Integer.parseInt(input[2]);

        visited = new boolean[n + 1];
        order = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int key : graph.keySet()) {
            graph.get(key).sort(null); 
        }

        dfs(v);

        for (int i = 1; i <= n; i++) {
            sb.append(order[i]).append('\n');
        }
    }

    void dfs(int node) {
        visited[node] = true;
        order[node] = count++;

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}
