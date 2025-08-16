import java.util.Scanner;

public class harshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ret = harshad(num);
        if (num % ret == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not harshad");
    }

    static int harshad(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + harshad(num / 10);
    }
}
