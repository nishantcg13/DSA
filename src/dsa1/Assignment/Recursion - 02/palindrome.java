import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ret = pal(num, 0);
        if (ret == num) {
            System.out.println("Palindrome!!");
        }
    }

    static int pal(int num, int rev) {
        if (num <= 0)
            return rev;
        return pal(num / 10, rev * 10 + num % 10);
    }
}
