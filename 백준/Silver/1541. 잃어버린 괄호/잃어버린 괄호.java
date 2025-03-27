
import java.io.*;

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
    String input ;
    String [] inputarr;
    int result = 0;
    void setting () throws NumberFormatException, IOException {
    	input = br.readLine();
    	inputarr = input.split("-");
    	
    	for(int i = 0 ; i < inputarr.length; i ++) {
    		String[] insum =inputarr[i].split("\\+");
    		
    		int sum = 0;
    		for(String num : insum)
    		{
    			sum += Integer.parseInt(num);
    		}
    		if(i == 0) {
    			result += sum;
    		}else {
    			result -= sum;
    		}
    	}
    	sb.append(result);
    	
    }

    void print() {
        System.out.print(sb);
    }
}
