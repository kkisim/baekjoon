import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n, start, target, m;
    List<Integer>[] graph;
    int[] dist;
    boolean[] visited;

    void setting() throws Exception {
        n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine().trim());

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); 
            int y = Integer.parseInt(st.nextToken()); 
            
            graph[x].add(y);
            graph[y].add(x);
        }

        sb.append(bfs());
    }

    int bfs() {
        dist = new int[n + 1];
        Arrays.fill(dist, -1);
        visited = new boolean[n + 1];

        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        visited[start] = true;
        dist[start] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == target) return dist[cur];

            for (int nxt : graph[cur]) {
                if (!visited[nxt]) {
                    visited[nxt] = true;
                    dist[nxt] = dist[cur] + 1;
                    q.add(nxt);
                }
            }
        }
        return -1;
    }

    void print() {
        System.out.println(sb.toString());
    }
}
