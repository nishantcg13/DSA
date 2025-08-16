import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (automorphic(num, num * num)) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }

    }

    static boolean automorphic(int num, int square) {
        if (num == 0) {
            return true;
        }
        if (num % 10 != square % 10) {
            return false;
        }
        return automorphic(num / 10, square / 10);
    }
}
