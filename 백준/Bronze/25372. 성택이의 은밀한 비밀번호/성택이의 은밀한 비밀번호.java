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
    	for(int i = 0; i <num; i ++) {
    		String s = br.readLine();
        	if(s.length() >= 6 && s.length() <= 9) {
        		sb.append("yes").append("\n");
        	}else {
        		sb.append("no").append("\n");
        	}
    	}
    }

   

    void print() {
        System.out.print(sb);
    }
}
