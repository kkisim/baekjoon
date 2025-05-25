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
    	int num = Integer.parseInt(br.readLine());
    	int min = num/5;
    	
    	if(num%5!=0) {min++;}
    	sb.append(min);
    }

   
    void print() {
        System.out.print(sb);
    }
}
