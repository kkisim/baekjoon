import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br;
    StringBuilder sb;
    int N;

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int A = 1;
        int B = 0;
        for(int i = 0; i<T;i++) {
        	int temp;
        	temp  = B;
        	B = B+A;
        	A = temp;
        	
        }
        sb.append(A).append(" ").append(B);
        
    
        
    }

    void print() {
        System.out.print(sb);
    }
}
