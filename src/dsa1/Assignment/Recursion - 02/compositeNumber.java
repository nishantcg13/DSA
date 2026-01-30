import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int newnum = num;
        int ret = composite(num, newnum);
        if (ret != 2) {
            System.out.println("Composite");
        } else {
            System.out.println("Prime");
        }
    }

    static int composite(int num, int newnum) {
        if (num == 0)
            return 0;
        if (newnum % num == 0)
            return 1 + composite(num - 1, newnum);
        return composite(num - 1, newnum);
    }
}
