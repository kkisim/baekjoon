
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack1 s = new Stack1();
        s.setting();
        s.cal();
        s.print();
    }
}

class Stack1 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num; 
    Stack<Integer> input = new Stack<Integer>();
    int [] su ;
    void setting() throws NumberFormatException, IOException {
    	num = Integer.parseInt(br.readLine());
    	su = new int [num];
    	for(int i = 0; i <num; i++) {
    		su[i] = Integer.parseInt(br.readLine());
    	}
    }
    void cal () {
    	int k =1;
   
    		for(int i = 0 ; i < num; i++) {
    			while(k <= su[i] ) {
    				input.push(k);
        			k++;
        			sb.append("+").append('\n');
    			}		
    			if(input.peek()==su[i]) {
        			input.pop();
        			sb.append("-").append('\n');
        		}else {
        			sb.setLength(0);
        			sb.append("NO");
        			break;
        		}		
    		}
    }
    void print() {
    	System.out.println(sb);
    }
}

