

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


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
	
 
    void setting () throws NumberFormatException, IOException {
    	num = Integer.parseInt(br.readLine());
    	int [] arr = new int[num];
    	
    	for(int i =0; i <num; i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    	}
    	Arrays.sort(arr);
    	for(int i = 0; i<num; i++) {
    		sb.append(arr[i]).append('\n');
    	}
    }

    void print() {
        System.out.print(sb);
    }
}
