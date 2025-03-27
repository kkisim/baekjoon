
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
    
 
    void setting () throws NumberFormatException, IOException {
    	int coin = 	Integer.parseInt(br.readLine());
    	int na = 1000-coin;
    	int count =0;
    	while(na >0) {
    		if(na>=500) {
    			na = na -500;
    			
    		}else if (na>=100) {
    			na = na-100;
    		}else if (na>=50) {
    			na = na -50;
    		}else if (na>=10) {
    			na = na -10;
    		}else if (na>=5) {
    			na = na -5;
    		}else {
    			na = na-1;
    		}
    		count++;
    	}
    	sb.append(count);
    	
    	
    	
    	
    }

    void print() {
        System.out.print(sb);
    }
}
