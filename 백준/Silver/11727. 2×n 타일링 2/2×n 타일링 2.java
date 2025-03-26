
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	Wave w = new Wave();
    	w.setting();
    	w.cal();
    	w.print();
    	
    	
    }
}

class Wave {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num;
    long arr[] = new long[1001];
    long result;
    void setting() throws NumberFormatException, IOException {
    	num = Integer.parseInt(br.readLine());
    	arr[1] = 1;
    	arr[2] = 3;
    	
    	for(int i = 3; i<1001;i++) {
    		arr[i] = (arr[i-1] + 2*arr[i-2])%10007  ;
    	}
    	result = arr[num];
    }
    void cal() {
    	sb.append(result);
    }
   
    void print() {
        System.out.print(sb);
    }
}
