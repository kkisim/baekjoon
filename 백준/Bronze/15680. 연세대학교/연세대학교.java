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
    	if(num == 0) {
    		sb.append("YONSEI");
    	}else {
    		sb.append("Leading the Way to the Future");
    	}
    }

   
    void print() {
        System.out.print(sb);
    }
}
