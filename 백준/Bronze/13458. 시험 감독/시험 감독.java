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
    	
    	int N = Integer.parseInt(br.readLine()); //시험장 개수
    	
    	String [] A = br.readLine().split(" "); //각시험장에서 응시자의 수
    	int a[] = new int [N];
    	String [] s = br.readLine().split(" "); //총감독관과 부감독관
    	int B= Integer.parseInt(s[0]); //총감독관이 측정한 인원
    	int C= Integer.parseInt(s[1]); //부감독관이 측정한 인원
    	Long count = 0L; //감독관의 최소 수
    	//각 시험장별로 인원수 측정
    	for(int i = 0; i<N; i ++) {
    		a[i] = Integer.parseInt(A[i]);
    	}
    	//감독관 수 세기
    	for(int i = 0; i <N; i++) {
    		count++;
    		int R = a[i] -= B;
    		
    		if(R > 0) {
    			count += (R/C);
    			if(R % C !=0) {
    				count++;
    			}
    		}
    	
    		
    	}
    
    	sb.append(count);
    	
      
    }
    

    void print() {
        System.out.println(sb);
    }
}
