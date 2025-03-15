
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	 Sort s = new Sort();
         s.read();
         s.sorting();
         s.print();
       
        
    }
}

class number {
    int num1;
    int num2;

    number(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

class Sort {
    int num;
    List<number> numbers;

    void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        numbers = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);
            numbers.add(new number(num1, num2));

        }
    }
    void sorting() {
        numbers.sort((a, b) -> {
            if (a.num1 != b.num1) return a.num1 - b.num1;  
            return a.num2 - b.num2;                        
        });
    }

    void print() {
        for (number n : numbers) {
            System.out.println(n.num1 + " " + n.num2);
        }
    }
 
}
