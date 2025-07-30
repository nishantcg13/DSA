import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        System.out.println(countOfNum(start, end));

    }
    // BRUTE FORCE APPROACH
    // static int count(int start, int end) {
    // int count = 0;
    // for (int i = start; i <= end; i++) {
    // count++;
    // }
    // return count;
    // }

    static int countOfNum(int start, int end) {
        return end - start + 1;
    }
}
