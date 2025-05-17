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
     
    	while(true) {
    		String [] s= br.readLine().split(" ");
        	int num1 = Integer.parseInt(s[0]);
        	int num2 = Integer.parseInt(s[1]);
        	if(num1 ==0 &&num2 ==0) {
        		break;
        	}
        	if(num1 > num2) {
        		sb.append("Yes").append("\n");
        	}else {
        		sb.append("No").append("\n");
        	}
    	}
    	
    	
     
    }

   

    void print() {
        System.out.print(sb);
    }
}
