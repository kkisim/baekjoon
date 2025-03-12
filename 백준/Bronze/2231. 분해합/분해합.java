
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Generator g = new Generator();
        g.setting();
        g.cal();
        g.print();
    }
}

class Generator {
    static Scanner sc = new Scanner(System.in);

    int N;
    int result;

    void setting() {
        N = sc.nextInt();
        result = 0; 
    }

    void cal() {
        for (int i = 1; i < N; i++) {
            int sum = i + digitSum(i);
            if (sum == N) {
                result = i;
                break; 
            }
        }
    }

    int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; 
            n /= 10;      
        }
        return sum;
    }

    void print() {
        System.out.println(result);
    }
}
