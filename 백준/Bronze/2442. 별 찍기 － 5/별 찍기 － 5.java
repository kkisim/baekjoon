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
    int n;
    
    void setting() throws NumberFormatException, IOException {
    	n= Integer.parseInt(br.readLine());
    	for(int i = 0; i < n; i++) {
    		for(int j = n-i; j-1 >0;j--) {
    			sb.append(" ");
    		}
    		for(int k = 0; k<i*2+1; k++) {
    			sb.append("*");
    		}
    		sb.append('\n');
    	}
    		
    	
    }

    
    void print() {
        System.out.print(sb);
    }
}