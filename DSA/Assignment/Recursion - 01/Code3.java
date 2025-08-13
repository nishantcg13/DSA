import java.util.*;

public class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= num; i++) {
        // sum += i;
        // }
        // System.out.println(sum);
        sumN(num);
    }

    static int sum = 0;

    static void sumN(int num) {
        if (num == 0) {
            return;
        }
        sumN(num - 1);
        sum = sum + num;
        System.out.println(sum);
    }
}
