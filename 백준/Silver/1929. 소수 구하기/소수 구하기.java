import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	so s = new so();
    	s.input();
    	s.cal();
    	s.print();
    }
}

class so {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int min ; 
    int max ;
    
    
    void input() throws IOException {
    	String [] num = br.readLine().split(" ");
    	min = Integer.parseInt(num[0]);
    	max = Integer.parseInt(num[1]);
    }
    void cal() {
    	for(int i = min ; i <=max; i++) {
    		if (i < 2) continue;
    		boolean isPrime = true;
    		for(int j = 2; j * j <= i; j++) {
    			if (i % j == 0) {
                    isPrime = false;
                    break;
                }
    		}
    		if(isPrime) {
    			sb.append(i).append('\n');
    		}
    	}
    }
    void print() {
    	System.out.println(sb);
    }
}
