

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.setting();
        p.cal();
        p.print();
    }
}

class Palindrome {
    static Scanner sc = new Scanner(System.in);
    ArrayList<String> inputList = new ArrayList<>();
    ArrayList<String> resultList = new ArrayList<>();

    void setting() {
        while (true) {
            String input = sc.nextLine();
            if (input.equals("0")) break;
            inputList.add(input);
        }
    }

    void cal() {
        for (String numStr : inputList) {
            String reversed = new StringBuilder(numStr).reverse().toString();
            if (numStr.equals(reversed)) {
                resultList.add("yes");
            } else {
                resultList.add("no");
            }
        }
    }

    void print() {
        for (String result : resultList) {
            System.out.println(result);
        }
    }
}
