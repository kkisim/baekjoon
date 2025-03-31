
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

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
    	String s ;
    	while ((s = br.readLine()) != null) {
    		sb.append(s).append('\n');;
    	}
      
      
    }
    void print() {
        System.out.println(sb);
    }
}
