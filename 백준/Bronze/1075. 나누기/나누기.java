
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
        int div = Integer.parseInt(br.readLine());
        int result = 0;
        num = (num/100)*100;
        
        for(int i = 0; i <100; i++) {
        	if((num+i) % div ==0) {
        		result = i;
        		break;
        	}
        }
        if(result <10) {
        	sb.append(0);
        }
        sb.append(result);
    }
    

    void print() {
        System.out.println(sb);
    }
}
