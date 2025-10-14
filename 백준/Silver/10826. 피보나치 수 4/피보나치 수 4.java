	import java.io.*;
	import java.math.BigInteger;
	import java.util.*;
	
	public class Main {
	    public static void main(String[] args) throws Exception {
	        C w = new C();
	        w.setting();
	        w.print();
	    }
	}
	
	class C {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	  
	    void setting() throws Exception {
	    	int n = Integer.parseInt(br.readLine().trim());

	    	
	    	BigInteger[] arr = new BigInteger[Math.max(2, n + 1)];
	    	arr[0] = BigInteger.ZERO;
	    	arr[1] = BigInteger.ONE;

	    	for (int i = 2; i <= n; i++) {         
	    	    arr[i] = arr[i - 1].add(arr[i - 2]);
	    	}

	    	sb.append(arr[n]).append('\n');         

	        
	        
	    }
	    
	    void print() {
	        System.out.println(sb.toString());
	    }
	}