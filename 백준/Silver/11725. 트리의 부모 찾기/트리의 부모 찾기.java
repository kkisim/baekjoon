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
    int num ;
    List<Integer>[] graph;
    int[] parent;
    boolean[] visited; 
    void setting() throws Exception {
    	num = Integer.parseInt(br.readLine());
    	graph = new ArrayList[num+1];
    	parent = new int [num+1];
    	 visited = new boolean[num+1];
        
        for (int i = 1; i <= num; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < num-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }
        bfs(1);
    	
    	
    	
    }
    void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int now = q.poll();
            for (int next : graph[now]) {
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = now; 
                    q.add(next);
                }
            }
        }
    }
    void print() {
    	for (int i = 2; i <= num; i++) {
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb.toString());
    }
}