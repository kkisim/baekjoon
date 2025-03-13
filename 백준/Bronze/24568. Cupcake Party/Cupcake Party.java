
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Cookie co = new Cookie();
    	co.setting();
    	co.cal();
    	co.print();
    }
}
class Cookie{
	static Scanner sc = new Scanner(System.in);
	int big;
	int small;
	int result;
	void setting () {
		big =sc.nextInt();
		small = sc.nextInt();
	}
	void cal() {
		big = big *8;
		small = small*3;
		result = big + small -28;
	}
	void print() {
		System.out.println(result);
	}
}

