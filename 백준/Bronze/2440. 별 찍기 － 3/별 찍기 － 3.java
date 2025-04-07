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

    void setting() throws IOException {
        
        int n = Integer.parseInt(br.readLine());
        int result = n;
       for(int j = 0; j < n; j ++) {
    	   for(int i = result ; i >0; i--) {
           	sb.append("*");
           }
    	   sb.append('\n');
    	   result--;
       }



     
   
    }

    void print() {
        System.out.print(sb);
    }
}
