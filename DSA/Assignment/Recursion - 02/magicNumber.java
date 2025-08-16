import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int newnum;
        // while (num >= 10) {
        // newnum = 0;
        // while (num > 0) {
        // newnum = num % 10 + newnum;
        // num /= 10;
        // }
        // num = newnum;
        // System.out.println(newnum);
        // if (newnum == 1) {
        // System.out.println("Magic Number");
        // break;
        // }
        // }
        int ret = magic(num);
        if (ret == 1)
            System.out.println("Magic ");
        else
            System.out.println("Not Magic " + ret);
    }

    static int magic(int num) {
        if (num < 10)
            return num;
        return magic(sumOfDigits(num));
    }

    static int sumOfDigits(int num) {
        if (num == 0)
            return 0;
        return (num % 10) + sumOfDigits(num / 10);
    }

}
