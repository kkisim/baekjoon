import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Sort s =new Sort();
    	s.setting();
    	s.sorting();
    }
}

class Sort{
	static Scanner sc = new Scanner(System.in);
	int num;
	int arr[];
	
	void setting() {
		num = sc.nextInt();
		arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
	}
	void sorting() {
		Arrays.sort(arr);
		print();
	}
	void print() {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < num; i++) {
	        sb.append(arr[i]).append('\n');
	    }
	    System.out.print(sb);
	}

	}


