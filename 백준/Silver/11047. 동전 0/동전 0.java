
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Coin c = new Coin();
    	c.setting();
    	c.cal();
    	c.print();
    
    }
}

class Coin {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num =0;
    int money;
    int arr[];
    int count = 0;
    void setting() throws IOException {
    	String s [] = br.readLine().split(" ");
    	num = Integer.parseInt(s[0]);
    	money = Integer.parseInt(s[1]);
    	
    }
    void cal () throws NumberFormatException, IOException {
    	arr = new int [num];
    	for(int i = 0; i< num; i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    	}
        for (int i = num - 1; i >= 0; i--) {
            if (arr[i] <= money) {
                int use = money / arr[i];
                count += use;
                money -= arr[i] * use;
            }
        }
    	sb.append(count);
    }
    void print() {
    	System.out.println(sb);
    }
}