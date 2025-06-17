
import java.io.*;
import java.util.*;

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
    	
    	String s[] = br.readLine().split(" ");
    	int count = 0;
    	for(int i = 0 ; i < 5; i ++){
    		int su = Integer.parseInt(s[i]);
    		if(num == su) {
    			count++;
    		}
    	}
    
    	
    	sb.append(count).append("\n");
      
    }
    


	void print() {
        System.out.println(sb);
    }
}
