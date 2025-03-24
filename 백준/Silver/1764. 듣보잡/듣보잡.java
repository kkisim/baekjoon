


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        hash se = new hash();
        se.setting();
        se.cal();
        se.print();
    }
}

class hash {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    Set<String> listen = new HashSet<>();
    List<String> result = new ArrayList<>();
    int num1;
    int num2;
    int count = 0;
    
    void setting () throws IOException {
    	String[]first = br.readLine().split(" ");
    	num1 = Integer.parseInt(first[0]);
    	num2 = Integer.parseInt(first[1]);
    	for(int i = 0; i <num1; i++) {
    		listen.add(br.readLine());
    	}
    	
    }
    void cal() throws IOException {
    	for(int i = 0; i <num2; i++) {
    		String input = br.readLine();
    		if(listen.contains(input)) {
    			result.add(input);
    			count++;
    		}
    	}
    	Collections.sort(result);

    }
    void print() {
        sb.append(count).append('\n');
        for(String name : result) {
        	sb.append(name).append('\n');	
        }
        System.out.println(sb);
    }
}