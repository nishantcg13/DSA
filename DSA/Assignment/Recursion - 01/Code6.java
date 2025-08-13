import java.util.*;

public class Code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // int sum = 0;
        // while (num > 0) {
        // sum = sum + num % 10;
        // num /= 10;
        // }
        // System.out.println(sum);
        int sum = sumOfNum(num);
        System.out.println(sum);

    }

    static int sumOfNum(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfNum(num / 10);
    }
}
