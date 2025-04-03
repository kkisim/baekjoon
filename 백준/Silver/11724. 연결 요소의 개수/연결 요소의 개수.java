
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

	HashMap<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
	Set<Integer> visited = new HashSet<Integer>();
    void setting() throws IOException {
    	String [] s = br.readLine().split(" ");
    	int gnum = Integer.parseInt(s[0]);
    	int pronum = Integer.parseInt(s[1]);
    	int count = 0;
    	for(int i = 1; i <=gnum; i++) {
    		graph.put(i, new ArrayList<Integer>());
    	}
    	for(int i = 0; i <pronum; i ++) {
    		String [] s1 = br.readLine().split(" ");
    		int getnum = Integer.parseInt(s1[0]);
    		int addnum = Integer.parseInt(s1[1]);
    		graph.get(getnum).add(addnum);
    		graph.get(addnum).add(getnum);
    	}
    	for (int i = 1; i <= gnum; i++) {
            if (!visited.contains(i)) {
                dfs(i);
                count++;
            }
        }
    	 sb.append(count).append('\n');
    }
    void dfs(int num) {
    	visited.add(num);
    	for(int  n : graph.get(num)) {
    		if(!visited.contains(n)) {
    			dfs(n);
    		}
    	}
    	
    }

    void print() {
        System.out.print(sb);
    }
}
