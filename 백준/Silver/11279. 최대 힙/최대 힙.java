import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

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
    PriorityQueue<Integer> q = 	new PriorityQueue<Integer>(Collections.reverseOrder());
    void setting() throws IOException {
    	int num = Integer.parseInt(br.readLine());
    	for(int i =0 ; i < num; i ++) {
    		int in = Integer.parseInt(br.readLine());
    		if( in == 0) {
    			if((q.peek())== null) {
    				sb.append(0).append('\n');
    			}else {
    				sb.append(q.poll()).append('\n');
    			}
    		}else {
    			q.offer(in);
    		}
    	}
    }
    void print() {
        System.out.print(sb);
    }
}
