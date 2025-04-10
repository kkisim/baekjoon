
import java.io.*;
import java.util.Arrays;
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
	 
	    void setting() throws IOException {
	    	String s [] = br.readLine().split(" ");
	    	int num [] = new int[3];
	    	for(int i = 0; i < 3;i ++) {
	    		num[i] = Integer.parseInt(s[i]);
	    	}
	    	
	    	Arrays.sort(num);
	    	sb.append(num[1]);
	    }
	    void print() {
	        System.out.print(sb);
	    }
	}
