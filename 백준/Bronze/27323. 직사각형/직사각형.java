

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
    int x;
    int y;
 
    void setting () throws NumberFormatException, IOException {
    	x= Integer.parseInt(br.readLine());
    	y= Integer.parseInt(br.readLine());
    	sb.append(x*y);
    }

    void print() {
        System.out.print(sb);
    }
}
