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
    StringTokenizer st;

    void setting() throws Exception {
      
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); //사야되는 기타줄 수
            int M = Integer.parseInt(st.nextToken()); //브랜드의 수

            
            
            int six = 1000;
            int one = 1000;

            
            for(int i = 0; i < M;i++) {
            	st = new StringTokenizer(br.readLine());
            	int temp1 = Integer.parseInt(st.nextToken());
            	int temp2 = Integer.parseInt(st.nextToken());
            	if(temp1 < six) {
            		six = temp1;
            	}
            	if(temp2 < one) {
            		one = temp2;
            	}
            }
            int x = N * one;
          
            int y = ((N + 5) / 6) * six;
            if (y < x) x = y;
            
            int mix = (N / 6) * six + (N % 6) * one;
            if (mix < x) x = mix;
            
            sb.append(x);
            
        }
    	
    

   

    void print() {
        System.out.print(sb.toString());
    }
}
