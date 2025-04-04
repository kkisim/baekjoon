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
    	for(int i  = 0 ; i < num; i++) {
    		String [] s = br.readLine().split(" ");
    		switch (s[0]) {
			case "push" :
				q.add(Integer.parseInt(s[1]));
				break;
			case "pop" :
				if(!q.isEmpty()) {
    				sb.append(q.poll()).append('\n');
    			}else {
    				sb.append(-1).append('\n');
    			}
				break;
			case "size" :
				sb.append(q.size()).append('\n');
				break;
			case "empty":
				if(q.isEmpty()) {
    				sb.append(1).append('\n');
    			}else {
    				sb.append(0).append('\n');
    			}
				break;
			case "front":
				if(!q.isEmpty()) {
    				sb.append(q.peek()).append('\n');
    			}else {
    				sb.append(-1).append('\n');
    			}
				break;
			case "back" :
				if(!q.isEmpty()) {
    				sb.append(q.peekLast()).append('\n');
    			}else {
    				sb.append(-1).append('\n');
    			}
				break;
			default:
				break;
			}
    	}
    
    }
    void print() {
        System.out.print(sb);
    }
}
