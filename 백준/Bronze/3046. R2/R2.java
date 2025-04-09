
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
	 
	    void setting() throws IOException {
	    	String s [] = br.readLine().split(" ");
	    	int R1 = Integer.parseInt(s[0]);
	    	int S = Integer.parseInt(s[1]);
	    	
	    	int R2 = 2*S-R1;
	    	sb.append(R2);
	    }
	    void print() {
	        System.out.print(sb);
	    }
	}
