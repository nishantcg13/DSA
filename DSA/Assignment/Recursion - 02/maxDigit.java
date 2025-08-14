import java.util.Scanner;

public class maxDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int ret = digit(num, max);
        System.out.println(ret);
        sc.close();
    }

    static int digit(int num, int max) {
        if (num <= 0)
            return max;
        if (max < num % 10)
            max = num % 10;
        return digit(num / 10, max);
    }
}
