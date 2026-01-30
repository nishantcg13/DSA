import java.util.*;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = findFactors(num);
        System.out.println(ans);
    }

    // BRUTE FORCE APPROACH
    /*
     * static int findFactors(int num) {
     * int count = 0;
     * for (int i = 1; i <= num; i++) {
     * if (num % i == 0) {
     * count++;
     * }
     * }
     * return count;
     * 
     * }
     */

    // OPTIMISED APPROACH
    /*
     * static int findFactors(int num) {
     * int count = 0;
     * for (int i = 1; i <= num / 2; i++) {
     * if (num % i == 0) {
     * count++;
     * }
     * }
     * return count + 1;
     * 
     * }
     */

    // BEST OPTIMISED
    static int findFactors(int num) {
        int count = 0;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                if (i == num % i)
                    count++;
                else
                    count += 2;
            }
        }
        return count;

    }
}