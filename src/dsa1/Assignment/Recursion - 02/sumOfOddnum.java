import java.util.Scanner;

public class sumOfOddnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ret = sum(num);
        System.out.println(ret);
        sc.close();
    }

    static int sum(int num) {
        if (num == 0)
            return 0;
        if (num % 2 != 0)
            return num + sum(num - 1);
        return sum(num - 1);
    }
}
