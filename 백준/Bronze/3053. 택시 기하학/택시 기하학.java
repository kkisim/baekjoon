import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void setting() throws Exception {
    	Double num = Double.parseDouble(br.readLine());
    	
    	
    	Double Euclid = Math.pow(num, 2)*Math.PI;
    	Double Taxi = 2*Math.pow(num,2);
    	String result1 = String.format("%6f", Euclid);
    	String result2 = String.format("%6f", Taxi);
       sb.append(result1).append("\n");
       sb.append(result2).append("\n");
       
    }

    void print() {
        System.out.println(sb.toString());
    }
}
