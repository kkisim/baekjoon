

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
    HashSet<Integer> numbers = new HashSet<>();

    void setting() throws IOException {
    	int num1 = Integer.parseInt(br.readLine());
    	String []num = br.readLine().split(" ");
    	for(int i = 0; i <num1; i++) {
    		int nums = Integer.parseInt(num[i]);
    		numbers.add(nums);
    	}
    	int pro1 = Integer.parseInt(br.readLine());
    	String pro [] = br.readLine().split(" ");
    	for(int i = 0; i <pro1; i++) {
    		int pro2 = Integer.parseInt(pro[i]);
    		if(numbers.contains(pro2) == true) {
    			sb.append(1).append(" ");
    		}else {
    			sb.append(0).append(" ");
    		}
    	}
    }
    void print() {
        System.out.println(sb);
    }
}
