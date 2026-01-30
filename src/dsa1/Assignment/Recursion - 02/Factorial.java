import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ret = factorial(num);
        System.out.println(ret);
        sc.close();
    }

    static int factorial(int num) {
        if (num == 0)
            return 1;

        return num * factorial(num - 1);

    }
}
