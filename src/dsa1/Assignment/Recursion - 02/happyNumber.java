import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class happyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashSet<Integer> sawNum = new HashSet<Integer>();
        boolean result = happy(num, sawNum);
        if (result)
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");
    }

    static boolean happy(int num, Set<Integer> sawNum) {
        if (num == 1) {
            return true;
        }
        if (!sawNum.add(num))
            return false;
        int sum = square(num);
        return happy(sum, sawNum);
    }

    static int square(int num) {
        if (num == 0) {
            return 0;
        } else {
            return (num % 10) * (num % 10) + square(num / 10);
        }
    }
}
