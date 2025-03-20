
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       StackChecker s = new StackChecker();
       s.setting();
       s.cal();
    }
}

class StackChecker {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num;
    void setting() throws NumberFormatException, IOException {
    	num = Integer.parseInt(br.readLine());
    	}
    void cal() throws NumberFormatException, IOException {
    	Stack<Integer> s = new Stack<Integer>();
    	for (int i =0; i < num; i++) {
    		int input = Integer.parseInt(br.readLine());
    		if(input != 0) {
    			s.push(input);
    		}else {
    			s.pop();
    		}
    	}
    	int sum = 0;
    	while(!s.isEmpty()) {
    		sum +=s.pop();
    	}
    	print(sum);
    }
    void print(int sum) {
    	System.out.println(sum);
    }
}
