import java.util.*;

public class Code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int factors = 0;
        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // factors++;
        // }
        // }
        // System.out.println(factors);
        int count = factors(num, 1);
        System.out.println(count);
        if (count == 2) {
            System.out.println("Prime");
        } else {
            if (count == 1) {
                System.out.println("Not composite nor prime");
                return;
            }
            System.out.println("Composite");
        }
    }

    static int factors(int num, int divisor) {

        if (divisor > num) {
            return 0;
        }
        if (num % divisor == 0) {
            return 1 + factors(num, divisor + 1);
        } else {
            return factors(num, divisor + 1);
        }

    }

}
