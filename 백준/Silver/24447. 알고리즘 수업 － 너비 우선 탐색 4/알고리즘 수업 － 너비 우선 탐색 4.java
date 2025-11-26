	import java.io.*;
	import java.math.BigInteger;
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
	    StringTokenizer st;
	    ArrayList<Integer>[] graph;
	    boolean visited [] ;
	    int depth[] ;
	    int count[] ;
	    long result ;
	    int c = 1;
	    void setting() throws Exception {

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
	            // 무방향 그래프이기 때문에 양쪽에서 더해준다
	            graph[a].add(b);
	            graph[b].add(a); 
	        }
	        for (int i = 1; i <= V; i++) {
	            Collections.sort(graph[i]); //오룸차순으로 
	        }


	        visited = new boolean[V + 1];   // 방문 여부
	        depth = new int[V + 1];         // 깊이 저장
	        count = new int[V + 1];         // 깊이 저장
	        Arrays.fill(depth, -1);         // 방문 안 한 노드는 -1
	        bfs(R);
	        for(int i = 1; i<V+1; i++) {
	            result += (long) depth[i] * (long) count[i];
	        }
	  
	    }
	    void bfs(int R) {

	    	 Queue<Integer> queue = new LinkedList<>();
	         visited[R] = true; //방문했다는 표시
	         depth[R] = 0;	//방문 순서 설정
	         count[R] = c++;
	         queue.add(R);		//탐색시작
	         while(!queue.isEmpty()) {
	        	 int current = queue.poll();
	        	 for(int n : graph[current]) {
	        		 if(!visited[n]) {
	        			 visited[n] = true;
	        			 count[n] = c++;
	                     depth[n] = depth[current] + 1;  // 현재보다 한 층 더 깊음
	        			 queue.add(n);
	        			 
	        		 }

	        	 }
	        	 
	         }
	    	
	    }

	    void print() {

	            sb.append(result).append("\n");
	        
	    	System.out.print(sb.toString());
	        
	    }
	    
	}