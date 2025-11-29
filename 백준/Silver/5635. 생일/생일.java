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
    String youngname;
    int youngday;
    String oldname;
    int oldday;

    void setting() throws Exception {
      

        int T = Integer.parseInt(br.readLine()); //케이스 개수
        
        st = new StringTokenizer(br.readLine());
    	String name = st.nextToken();

    	int d = Integer.parseInt(st.nextToken());

    	int m = Integer.parseInt(st.nextToken());

    	int y = Integer.parseInt(st.nextToken());
    	
    	int day = y * 10000 + m * 100 + d;
    	
        youngname = name;
        youngday = day;
        oldname = name;
        oldday = day;
        for (int i = 1; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            d = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            day = y * 10000 + m * 100 + d;

            // 가장 나이가 적은 사람 
            if (day > youngday) {
                youngday = day;
                youngname = name;
            }

            // 가장 나이가 많은 사람 
            if (day < oldday) {
                oldday = day;
                oldname = name;
            }
        }
        
    }

   

    void print() {
        sb.append(youngname).append('\n');
        sb.append(oldname).append('\n');
        System.out.print(sb.toString());
    }
}
