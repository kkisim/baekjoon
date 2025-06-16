
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
    	int result = num;
    	int i = 0;
    	while ((int)Math.log10(result) <= (int)Math.log10(num)) {
    		
    		
    		result = result*2;
    		i++;
    	}
    	if(i !=0) {
    		i--;
    	}
    	
    	sb.append(i).append("\n");
      
    }
    


	void print() {
        System.out.println(sb);
    }
}
