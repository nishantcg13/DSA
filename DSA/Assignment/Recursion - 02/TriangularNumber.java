import java.util.Scanner;

public class TriangularNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = isTriangular(1, 0, num);

        if (result == num) {
            System.out.println("Triangular");
        } else {
            System.out.println("Not Triangular");
        }
    }

    static int isTriangular(int itr, int sum, int num) {
        if (sum == num) {
            return sum;
        }
        if (sum > num) {
            return -1;
        }
        return isTriangular(itr + 1, sum + itr, num);
    }
}
