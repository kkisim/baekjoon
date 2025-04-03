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
    	
    	int result = ja(num);
    	 sb.append(result);
    }
     int ja(int num) {
    	if(num <= 1 ) {return num;
    	}
		return ja(num-2) + ja(num-1);
    	
    }

    void print() {
        System.out.print(sb);
    }
}
