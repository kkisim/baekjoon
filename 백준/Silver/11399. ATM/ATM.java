
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	sort s = new sort();
    	s.cal();
    	s.print();
    
    }
}

class sort {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num;
    int [] arr;
    int result = 0;
   
    void cal () throws NumberFormatException, IOException {
    	num = Integer.parseInt(br.readLine());
    	String [] s = br.readLine().split(" ");
    	arr = new int [num];
    	for(int i =0; i<num; i++) {
    		arr[i] = Integer.parseInt(s[i]);
    	}
    	Arrays.sort(arr);
    	
    	for(int i = 0; i < num; i++) {
    		int count =0;
    		for(int j =0; j <= i ; j++ ) {
    			count=count+arr[j];
    		}
    		result = result+count;
    	}
    	sb.append(result);
    }
    
    void print() {
    	System.out.println(sb);
    }
}