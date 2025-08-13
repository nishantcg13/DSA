import java.util.*;

public class Code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int fact = 1;
        // for (int i = 1; i <= num; i++) {
        // fact *= i;
        // }
        int fact = factorial(num);
        System.out.println(fact);

    }

    static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
