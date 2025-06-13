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
    	
    	int N = Integer.parseInt(br.readLine());
    	 
    	int arr[][] = new int [N][10];
    	for(int i = 0; i < N; i ++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j = 0 ; j <10; j ++) {
    			arr[i][j] = Integer.parseInt(st.nextToken());
    		}
    		Arrays.sort(arr[i]);
    		sb.append(arr[i][7]).append("\n"); 
    	}
    
    	
    	
      
    }
    

    void print() {
        System.out.println(sb);
    }
}
