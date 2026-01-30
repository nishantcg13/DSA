import java.util.Scanner;

public class productOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ret = prod(num);
        System.out.println(ret);
        sc.close();
    }

    static int prod(int num) {
        if (num == 0)
            return 1;

        return num % 10 * prod(num / 10);
    }
}
