
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	black b = new black();
    	b.setting();
    	b.cal();
    	b.print();
    }
}

class black{
	static Scanner sc = new Scanner(System.in);
	
	int num;
	int hap;
	int result;
	int arr[];
	int temp;
	void setting () {
		num = sc.nextInt();
		hap = sc.nextInt();
		arr = new int [num];
		temp = 0;
		for (int i =0; i <num;i++) {
			arr[i]= sc.nextInt();
		}
	}
	
	void cal() {
	    for (int i = 0; i < num - 2; i++) {
	        for (int j = i + 1; j < num - 1; j++) {
	            for (int k = j + 1; k < num; k++) {
	                result = arr[i] + arr[j] + arr[k];
	                if (result <= hap && temp < result) {
	                    temp = result;
	                }
	            }
	        }
	    }
	}

	
	void print() {
		System.out.println(temp);
	}
}
