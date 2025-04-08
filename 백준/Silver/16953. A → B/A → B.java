import java.io.*;
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
    	String [] s = br.readLine().split(" ");
    	int num = Integer.parseInt(s[0]);
    	int renum = Integer.parseInt(s[1]);
    	
    	int count = 1;
    	
    	while(true) {
    		if(renum == num) {
    			break;
    		}else if(num > renum) {
    			count = -1;
    			break;
    		}
    		if(renum % 2 ==0) {
    			renum /=2;
    		}else if(renum % 10 ==1) {
    			renum = (renum -1)/10;
    		}else {
    			count = -1;
    			break;
    		}
    		count++;
    	}
    	sb.append(count);
    	
    }

    void print() {
        System.out.print(sb);
    }
}
