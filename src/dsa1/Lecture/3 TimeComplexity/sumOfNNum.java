import java.util.Scanner;

public class sumOfNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(sumOfNum(num));

    }

    static int sumOfNum(int num) {
        int sum = 0;

        // Brute Force Approach
        // for (int i = 1; i <= num; i++) {
        // sum += i;
        // }

        sum = (num * (num + 1)) / 2;
        return sum;
    }

}
