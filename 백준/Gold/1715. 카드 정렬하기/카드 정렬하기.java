import java.io.*;
import java.math.BigInteger;
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
    PriorityQueue<Integer> Q = new PriorityQueue<>();
    void setting() throws IOException {
    	int num = Integer.parseInt(br.readLine());
    	for(int i = 0; i <num; i++) {
    		int qnum = Integer.parseInt(br.readLine());
    		Q.offer(qnum);
    	}
    	int result = 0;
    	while(Q.size()>1) {
    		int a = Q.poll();
    		int b = Q.poll();
    		int sum = a+b;
    		result += sum;
    		Q.offer(sum);
    	}
    	
    	sb.append(result);
    }

    void print() {
        System.out.print(sb);
    }
}
