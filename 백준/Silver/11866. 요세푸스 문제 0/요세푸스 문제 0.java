
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	que q = new que();
    	q.input();
    	q.solve();
    	q.print();
    }
}

class que {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    Queue<Integer> q = new LinkedList<Integer>();
    int num1;
    int num2;
    void input() throws IOException {
    	String [] num = br.readLine().split(" ");
    	num1 = Integer.parseInt(num[0]);
    	num2 = Integer.parseInt(num[1]);
    	
    	for(int i = 1; i<=num1; i++) {
    		q.add(i);
    	}
    }
    void solve() {
        sb.append("<");

        while (!q.isEmpty()) {
            for (int i = 1; i < num2; i++) {
                q.offer(q.poll()); 
            }
            sb.append(q.poll());
            if (!q.isEmpty()) sb.append(", ");
        }

        sb.append(">");
    }

    void print() {
        System.out.println(sb);
    }
}
