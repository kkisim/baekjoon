
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

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
    	int num = Integer.parseInt(br.readLine());
    	HashSet<String> list = new HashSet<String>();
    	list.add("ChongChong");
    	for(int i = 0; i <num; i++) {
    		String s [] = br.readLine().split(" ");
    		if(list.contains(s[0])|list.contains(s[1])) {
    			list.add(s[0]);
    			list.add(s[1]);
    		}
    		
    	}
    	sb.append(list.size());
    	
    	
    }
    

    void print() {
        System.out.print(sb);
    }

    static class Node {
        
    }
}
