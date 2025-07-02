import java.io.*;
import java.util.*;

import javax.net.ssl.SSLEngine;

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
    	int arr [] = new int[9];
    	int sum  = 0;
    	for(int i = 0; i <arr.length;i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    		sum += arr[i];
    	}
    	
    	for(int i =0; i < arr.length; i++) {
    		for(int j = 1; j<arr.length-1; j++) {
    			if(sum - arr[i]-arr[j] == 100) {
    				List<Integer> list = new ArrayList<Integer>();
    				for(int k = 0; k <arr.length; k++) {
    					if(k != i && k!=j ) {
    						list.add(arr[k]);
    					}
    				}
    				Collections.sort(list);
    				for(int h : list) {
    					sb.append(h).append("\n");
    				}
    				return;
    			}
    		}
    	}
     
    }
        
    void print() {
        System.out.println(sb);
    }
}
