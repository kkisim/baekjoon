
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
      double start = Double.parseDouble(br.readLine());
      double end = Double.parseDouble(br.readLine());
     
      int count = 0;
      int min =-1;
      for(double i = Math.ceil(Math.sqrt(start)); i <= Math.sqrt(end); i++) {
    	  if(min == -1) {
    		  min =(int)(i*i);
    	  }
    	  count += (int)(i*i);
      }
      if(min !=-1) {
      sb.append(count).append('\n');
      sb.append(min);
      }else {
    	  sb.append(min);
      }
    }

    void print() {
        System.out.print(sb);
    }
}