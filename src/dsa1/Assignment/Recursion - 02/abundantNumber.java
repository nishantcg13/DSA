import java.util.Scanner;

public class abundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int newnum = num;
        int ret = abundant(num, newnum);
        if (ret > num) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Deficient Number");
        }
    }

    static int abundant(int num, int newnum) {
        if (num == 0)
            return 0;
        if (newnum % num == 0 && newnum != num) {
            return num + abundant(num - 1, newnum);
        }
        return abundant(num - 1, newnum);
    }
}
