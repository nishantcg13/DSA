import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int length = String.valueOf(num).length();
        int ret = armstrong(num, length);
        if(ret == num)
            System.out.println();
    }

    static int armstrong(int num, int length) {
        if (num == 0)
            return 0;
        return (int) (Math.pow(num % 10, length) + armstrong(num / 10, length));
    }

}
