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
    	char[][] chess = new char[8][8]; 
    	
    	for(int i = 0; i < 8; i++) {
    		String s   = br.readLine();
    		for(int j =0 ; j<8 ; j++) {
    			chess[i][j] = s.charAt(j);
    		}
    	}
    	
    	int count = 0; 
    	for(int i =0; i<8; i ++) {
    		for(int j = 0; j  <8; j++) {
    			if((i + j) % 2 == 0 && chess[i][j] == 'F') {
    				count ++;
    			}
    		}
    	}
    	sb.append(count);
       
      
    }
    

    void print() {
        System.out.println(sb);
    }
}
