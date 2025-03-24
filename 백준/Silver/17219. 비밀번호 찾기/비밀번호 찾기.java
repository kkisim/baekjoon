
import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
       ATM a = new ATM();
       a.Setting();
       a.search();
       a.print();
    }
}

class ATM {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num;
    int input;
    HashMap<String, String> h1 = new HashMap<String, String>();
    void Setting() throws IOException {
    	String s [] = br.readLine().split(" ");
    	num = Integer.parseInt(s[0]);
    	input = Integer.parseInt(s[1]);
    	
    	for(int i = 0; i <num; i++) {
    		String n [] = br.readLine().split(" ");
    		h1.put(n[0],n[1]);
    	}
    }
    void search() throws IOException {
    	for(int i =0; i<input;i++) {
    		String in = br.readLine();
    		sb.append(h1.get(in)).append('\n');
    	
    	}
    	
    }

    void print() {
        System.out.print(sb);
    }
}