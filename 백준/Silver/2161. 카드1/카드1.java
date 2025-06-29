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
    Stack<Character> stack = new Stack<>();

    void setting() throws IOException {
    	int num = Integer.parseInt(br.readLine());
    	
    	ArrayDeque<Integer> d = new ArrayDeque<Integer>();
    	
    	//카드 놓기
    	for(int i = 1 ; i<= num; i++) {
    		d.addFirst(i);    		
    	}
    	while(!d.isEmpty()) {
    		//버리기
    		int trash = d.pollLast();
    		sb.append(trash).append(" ");
    		//뒤로 놓기
    		if(!d.isEmpty()) {
    			int back = d.pollLast();
        		d.addFirst(back);
    		}
    	}
    	
      
    }

    void print() {
        System.out.println(sb);
    }
}
