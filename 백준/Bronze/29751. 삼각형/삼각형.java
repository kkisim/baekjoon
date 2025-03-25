import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	String [] s = br.readLine().split(" ");
    	double i = Double.parseDouble(s[0]);
    	double j = Double.parseDouble(s[1]);
    	
    	sb.append(i*j*0.5);
    	System.out.println(sb);
    	
   
    }
}