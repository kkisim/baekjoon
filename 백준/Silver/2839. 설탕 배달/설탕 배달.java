
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	sugar s = new sugar();
    	s.setting();
    	s.cal();
    	s.print();
    	
    }
}

class sugar {
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num;
    int five;
    int three;
    int result = -1;
    void setting() throws NumberFormatException, IOException {
    	num = Integer.parseInt(br.readLine());
    }
    void cal() {
    	while (num >= 0) {
    		if (num % 5 ==0) {
    			five = num/5;
    			result = five + three;
    			break;
    		}else {
    			num -=3;
    			three +=1;
    			
    		}
    	}
    }
    void print() {
    	System.out.println(result);
    }
   
}
