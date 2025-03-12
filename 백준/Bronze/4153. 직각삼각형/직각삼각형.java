
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.loop(); 
    }
}

class Triangle {
    static Scanner sc = new Scanner(System.in);
    int[] num = new int[3];

    void loop() {
        while (true) {
            input();
            if (isExit()) break;
            cal();
        }
    }

    void input() {
        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
        }
    }

    boolean isExit() {
        return num[0] == 0 && num[1] == 0 && num[2] == 0;
    }

    void cal() {
  
        java.util.Arrays.sort(num);

        int a = num[0];
        int b = num[1];
        int c = num[2];

        if (a * a + b * b == c * c) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}
