
import java.io.*;
import java.util.Arrays;
import java.util.Collections;


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
    int num;
	int cut;
 
    void setting () throws NumberFormatException, IOException {
    	
    
    	
    	String input []  = br.readLine().split("");
    	Integer arr[] = new Integer [input.length];
    	for(int i =0; i <input.length; i++) {
    			arr[i] = Integer.parseInt(input[i]);
    		
    		}
    	
    	Arrays.sort(arr, Collections.reverseOrder());
    	for(int i = 0; i <arr.length; i++) {
    		sb.append(arr[i]);
    	}
    	
    }

    void print() {
        System.out.print(sb);
    }
}
