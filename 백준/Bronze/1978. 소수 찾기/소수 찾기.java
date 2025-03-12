
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Demical de = new Demical();
    	de.setting();
    	de.cal();
    	de.print();
    }
}
class Demical{
	static Scanner sc = new Scanner(System.in);
	
	int num;
	int [] de;
	int count;
	int result;
	void setting() {
	    num = sc.nextInt();
	    de = new int[num];
	    for (int i = 0; i < num; i++) {
	        de[i] = sc.nextInt(); 
	    }
	    result = 0;
	}

	
	void cal() {
	    for (int i = 0; i < num; i++) {
	        int n = de[i];
	        if (n < 2) continue; 

	        boolean isPrime = true;
	        for (int j = 2; j * j <= n; j++) {
	            if (n % j == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        if (isPrime) result++;
	    }
	}

	void print() {
		System.out.println(result);
	}
}