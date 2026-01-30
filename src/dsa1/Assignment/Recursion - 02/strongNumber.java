import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ret = strong(num);
        System.out.println(ret);
        if (ret == num) {
            System.out.println("Strong Number: " + ret);
        }
        // Using for loops
        // int factsum = 0;
        // while (num > 0) {
        // int fact = 1;
        // for (int i = 1; i <= num % 10; i++) {
        // fact = fact * i;
        // }
        // factsum += fact;
        // num /= 10;
        // }

    }

    static int strong(int num) {
        if (num <= 0)
            return 0;
        return factorial(num % 10) + strong(num / 10);
    }

    static int factorial(int num) {
        if (num == 0)
            return 1;
        return num * factorial(num - 1);
    }
}