
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Cal c = new Cal();
       c.cal();
       c.re();
       c.print();
       

  
    }
}
class Cal{
	static Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int c;
	int num;
	int result[] = new int [10];
	String str;
	void cal() {
		this.a = sc.nextInt();
		this.b = sc.nextInt();
		this.c = sc.nextInt();
		
		num = a*b*c;
	}
	
	void re() {
		 String str = Integer.toString(num);
		 for (int i = 0; i < str.length(); i++) {
	            int digit = str.charAt(i) - '0'; // 문자 -> 숫자
	            result[digit]++;
	        }
		}
	void print() {
	for (int i = 0; i < 10; i++) {
        System.out.println(result[i]);
    }

}
}