import java.util.*;

public class Code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int length = 0;
        // while (num > 0) {
        // num = num / 10;
        // length++;
        // }
        // System.out.println(length);
        int length = numLength(num);
        System.out.println(length);
    }

    static int length = 0;

    static int numLength(int num) {
        if (num == 0) {
            return length;
        }
        num /= 10;
        length++;
        numLength(num);
        return length;
    }
}
