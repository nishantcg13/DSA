import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int newnum = num;
        // int pal = 0;
        // while (num > 0) {
        // pal = pal * 10 + num % 10;
        // num /= 10;
        // }
        // if (pal == newnum) {
        // System.out.println("Palindrome");
        // }
        int pal = Palindrome(num, 0);
        if (pal == num) {
            System.out.println("Palindrome");
        }
    }

    static int Palindrome(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        return Palindrome(num / 10, rev * 10 + num % 10);
    }
}
