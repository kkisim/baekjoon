import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

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
    Deque<Integer> q= new LinkedList<Integer>();
    void setting() throws IOException {
    	int num = Integer.parseInt(br.readLine());
    	int su = 0;
    	for(int i  = 0 ; i < num; i++) {
    		String [] s = br.readLine().split(" ");
    		int co = Integer.parseInt(s[0]);
    		switch (co) {
    		case 1:
    			su = Integer.parseInt(s[1]);
    			q.addFirst(su);
    			break;
    		case 2:
    			su = Integer.parseInt(s[1]);
    			q.addLast(su);
    			break;
    		case 3:
    			if(!q.isEmpty()) {
    				sb.append(q.pollFirst()).append('\n');
    			}
    			else {
    				sb.append(-1).append('\n');
    			}
    			break;
    		case 4:
    			if(!q.isEmpty()) {
    				sb.append(q.pollLast()).append('\n');
    			}else {
    				sb.append(-1).append('\n');
    			}
    			break;
    		case 5:
    			sb.append(q.size()).append('\n');
    			break;
    		case 6:
    			if(q.isEmpty()) {
    				sb.append(1).append('\n');
    			}else {
    				sb.append(0).append('\n');
    			}
    			break;
    		case 7:
    			if(!q.isEmpty()) {
    				sb.append(q.peekFirst()).append('\n');
    			}else {
    				sb.append(-1).append('\n');
    			}
    			break;
    		case 8:
    			if(!q.isEmpty()) {
    				sb.append(q.peekLast()).append('\n');
    			}else {
    				sb.append(-1).append('\n');
    			}
    			break;
    		}
    	}
    
    }
    void print() {
        System.out.print(sb);
    }
}
