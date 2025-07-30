import java.util.*;

class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(findFactors(num));
    }

    static int findFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (i * i < num) {
                continue;
            } else if ((i * i) == num) {
                return i;
            } else {
                return i - 1;
            }
        }
        return 0;
    }
}