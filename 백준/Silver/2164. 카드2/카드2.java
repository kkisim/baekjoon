
	
	import java.io.*;
	import java.util.*;
	
	public class Main {
	    public static void main(String[] args) throws IOException {
	    	card c = new card();
	    	c.input();
	    	c.cal();
	    	c.print();
	    	
	    }
	}
	
	class card {
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    Queue<Integer> q = new LinkedList<>();
	   int num1;
	    void input() throws NumberFormatException, IOException {
	    	num1 = Integer.parseInt(br.readLine());
	    	for (int i = 1; i<=num1; i++) {
	    		q.add(i);
	    	}
	    }
	    void cal() {
	        while (q.size() > 1) {
	            q.poll();           
	            q.offer(q.poll());  
	        }
	    }

	    
	    void print() {
	    	System.out.println(q.peek());
	    }
		    
	}
