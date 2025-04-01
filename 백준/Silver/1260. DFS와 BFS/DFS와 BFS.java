import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Graph g = new Graph();
        g.setting();
        g.print();
    }
}

class Graph {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    ArrayList<Integer>[] graph;
    boolean[] visited;
    int n, m, v;

    void setting() throws IOException {
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]); 
        m = Integer.parseInt(input[1]); 
        v = Integer.parseInt(input[2]); 

        graph = new ArrayList[n + 1]; 
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            String[] edge = br.readLine().split(" ");
            int a = Integer.parseInt(edge[0]);
            int b = Integer.parseInt(edge[1]);
            graph[a].add(b);
            graph[b].add(a); 
        }
   
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        visited = new boolean[n + 1];
        dfs(v);
        sb.append("\n");

        visited = new boolean[n + 1];
        bfs(v);
    }

    void dfs(int node) {
        visited[node] = true;
        sb.append(node).append(" ");

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            sb.append(cur).append(" ");

            for (int next : graph[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    void print() {
        System.out.println(sb);
    }
}
