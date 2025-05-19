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
     
    	
    	int y = Integer.parseInt(br.readLine());
    	int x = Integer.parseInt(br.readLine());
    	for(int i = 0 ; i <y; i++) {
    		for(int j = 0 ; j  <x ; j++) {
    			sb.append("*");
    		}
    		sb.append("\n");
    	}
    	
     
    }

   

    void print() {
        System.out.print(sb);
    }
}
