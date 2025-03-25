
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	virus v = new virus();
    	v.setting();
    	v.dfs(1);
    	v.print();
        
    }
}

class virus {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num;
    int pro;
    List<Integer>[] vi ;
    boolean visited[] ;
    
    int count = 0;
    void setting () throws NumberFormatException, IOException {
    	num = Integer.parseInt(br.readLine());
    	pro = Integer.parseInt(br.readLine());
    	vi =  new ArrayList[num+1];
    	visited = new boolean[num+1];
    	for(int i = 1; i <= num; i ++) {
    		 vi[i] = new ArrayList<Integer>();
    	}
    	
    	for(int i = 0 ; i <pro; i++) {
    		String [] s = br.readLine().split(" ");
    		int main = Integer.parseInt(s[0]);
    		int link = Integer.parseInt(s[1]);
    		
    		vi[main].add(link);
    		vi[link].add(main);
    	}
    	
    }
    void dfs(int node) {
	    visited[node] = true;
	    for (int next : vi[node]) {
	        if (!visited[next]) {
	            count++; 
	            dfs(next); 
	        }
	    }
	}
	void print() {
		sb.append(count);
		System.out.println(sb);
	}
    
    
}
