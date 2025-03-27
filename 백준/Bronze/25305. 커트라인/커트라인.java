

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
    	String [] s = br.readLine().split(" ");
    	num = Integer.parseInt(s[0]);
    	cut = Integer.parseInt(s[1]);
    	
    	Integer[] arr = new Integer[num]; 
    	
    

    	String input []  = br.readLine().split(" ");
    	for(int i =0; i <num; i++) {
    		arr[i] = Integer.parseInt(input[i]);
    	}
    	Arrays.sort(arr, Collections.reverseOrder());
    	sb.append(arr[cut - 1]);
    	
    }

    void print() {
        System.out.print(sb);
    }
}
