
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      so s = new so();
      s.setting();
      s.print();
    }
}



class so {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num;
    void setting() throws NumberFormatException, IOException {
    	num = Integer.parseInt(br.readLine());
    	
    	double num1 = Math.pow(2,num);
    	double num2 = Math.pow(num1+1, 2);
    	int result = (int) num2;
    	sb.append(result);
    	
    }
   
    void print() {
        System.out.print(sb);
    }
}