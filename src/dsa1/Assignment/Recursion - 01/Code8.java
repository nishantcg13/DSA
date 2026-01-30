// count occurence of digit in given number

import java.util.*;

public class Code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the digit: ");
        int digit = sc.nextInt();
        // int count = 0;
        // while (num > 0) {
        // if (num % 10 == digit) {
        // count++;
        // }
        // num /= 10;
        // }
        // System.out.println(count);
        int count = occurence(num, digit);
        System.out.println(count);
    }

    static int occurence(int num, int digit) {
        if (num == 0) {
            return 0;
        }
        if (num % 10 == digit) {
            return 1 + occurence(num / 10, digit);
        } else
            return occurence(num / 10, digit);
    }
}
