import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        C c = new C();
        c.setting();
        c.print();
    }
}
class C {
    BufferedReader br;
    StringBuilder sb;
    boolean visited [] ;
    ArrayList<Integer>[] graph;
    int count[] ;
    int c = 1;
    

    void setting() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        
        int V  = Integer.parseInt(st.nextToken()); //정점
        int E  = Integer.parseInt(st.nextToken()); //간선
        int R  = Integer.parseInt(st.nextToken()); //시작노드
        
        graph = new ArrayList[V + 1]; 
        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < E; i++) {
        	st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 무방향 그래프 이기때문에 양쪽에서 더해준다
            graph[a].add(b);
            graph[b].add(a); 
        }
        
        for (int i = 1; i <= V; i++) {
            Collections.sort(graph[i]); //오룸차순으로 
        }
        
        visited = new boolean[V + 1];  //방문 여부 체크하기
        count = new int[V + 1]; 	//방문 순서 체크 하기
        bfs(R); 
  
    }
    void bfs(int R) {
    	 Queue<Integer> queue = new LinkedList<>();
         visited[R] = true; //방문했다는 표시
         count[R] = c++;	//방문 순서 설정
         queue.add(R);		//탐색시작
         while(!queue.isEmpty()) {
        	 int current = queue.poll();
        	 for(int n : graph[current]) {
        		 if(!visited[n]) {
        			 visited[n] = true;
        			 count[n]=c++;
        			 queue.add(n);
        		 }
        	 }
         }
    	
    }

    void print() {
    	for (int i = 1; i < count.length; i++) {
            sb.append(count[i]).append("\n");
        }
        System.out.print(sb);
    }
}