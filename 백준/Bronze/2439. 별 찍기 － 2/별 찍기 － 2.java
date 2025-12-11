import java.util.*;

public class Main {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();

    	for(int i=1; i<=a; i++) {
             String b ="";   	
    		for(int j =1; j <= a-i; j++) {
    			b=b+" ";
    		}
    		for(int k =1; k<=i; k++) {
    			b=b+"*";
    		}
    		System.out.println(b);
    	}
    	
    }
}