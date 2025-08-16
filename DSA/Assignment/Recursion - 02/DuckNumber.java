import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if (isDuck(num, 0)) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not Duck Number");
        }
    }

    static boolean isDuck(String num, int index) {
        if (num.charAt(0) == '0') {
            return false;
        }
        if (num.charAt(index) == '0') {
            return true;
        }
        return isDuck(num, index + 1);
    }
}
