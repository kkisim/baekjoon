
	import java.io.*;
	import java.util.*;
	
	public class Main {
	    public static void main(String[] args) throws IOException {
	    	findnum f = new findnum();
	    	f.firstnum();
	    	f.secondnum();
	    	f.compare();
	    	f.print();
	    	
	    }
	}
	
	class findnum {
		int [] arr1;
		int [] arr2;
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int num1;//첫번째 길이
	    int num2;//두번째 길이
	    int [] result ;
	    void firstnum() throws NumberFormatException, IOException {
	    	num1 = Integer.parseInt(br.readLine());
	    	String [] st = br.readLine().split(" ");
	    	arr1 = new int [num1];
	    	for(int i = 0; i < num1; i++) {
	    		arr1[i] = Integer.parseInt(st[i]);
	    	}
	    	
	    }
	    void secondnum() throws NumberFormatException, IOException {
	    	num2 = Integer.parseInt(br.readLine());
	    	String [] st = br.readLine().split(" ");
	    	arr2 = new int [num2];
	    	for(int i = 0; i < num2; i++) {
	    		arr2[i] = Integer.parseInt(st[i]);
	    	}
	    }
	   void compare() {
		   Arrays.sort(arr1);
		   result = new int [num2];
		   for (int i = 0; i < num2; i++) {
		       if (Arrays.binarySearch(arr1, arr2[i]) >= 0) {
		           result[i] = 1;
		       } else {
		           result[i] = 0;
		       }
		   }
		   
		   }
	   
	   void print() {
		   for(int i =0; i < result.length; i++) {
			   System.out.println(result[i]);
		   }
	   }
	    
	}
