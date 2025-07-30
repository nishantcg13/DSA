import java.util.*;

public class sqrtbinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(sqrt(num));
    }

    static int sqrt(int num) {
        int itr = 0;
        int start = 1;
        int end = num;
        int ans = 0;
        while (start <= end) {
            itr++;
            int mid = (start + end) / 2;
            int sqr = mid * mid;
            if (sqr == num) {
                System.out.println("Iterator: " + itr);
                return mid;
            }
            if (sqr > num) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        System.out.println("Iterator: " + itr);
        return ans;
    }
}
