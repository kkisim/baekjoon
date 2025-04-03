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
    boolean [] num = new boolean [10001];

    void setting() throws IOException {
    	for(int i =1 ; i<= 10000; i++) {
    		int n = self(i);
    		if(n <= 10000) {
    			num[n] = true;
    			}
    		}
    	for (int i = 1; i <= 10000; i++) {
            if (!num[i]) {
                sb.append(i).append('\n');
            }
        }
    	}
       
    
    public static int self(int num) {
    	int sum = num;
    	while(num != 0) {
    		sum = sum + (num%10);
    		num = num/10;
    	}
    	return sum;
    }

    void print() {
        System.out.print(sb);
    }
}
