
import java.io.*;
import java.util.Stack;

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
    Stack<Integer> stk = new Stack<Integer>();
    void setting() throws IOException {
    	int num = Integer.parseInt(br.readLine());
    	for(int i = 0 ; i <num; i++) {
    		String s [] = br.readLine().split(" ");
    		int num1 = Integer.parseInt(s[0]);
    		switch (num1) {
			case 1: 
				int num2 = Integer.parseInt(s[1]);
				stk.push(num2);
				break;
			case 2: 
				if(!stk.empty()) {
					int val = stk.pop();
					sb.append(val).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
			case 3:
				int val = stk.size();
				sb.append(val).append('\n');
				break;
			case 4:
				if(stk.empty()) {
					sb.append(1).append('\n');
				}else {
					sb.append(0).append('\n');
				}
				break;
			case 5 :
				if(!stk.empty()) {
					sb.append(stk.peek()).append('\n');
				}else {
					sb.append(-1).append('\n');
				}
				break;
			}
    	}
    }

    void print() {
        System.out.println(sb);
    }
}
