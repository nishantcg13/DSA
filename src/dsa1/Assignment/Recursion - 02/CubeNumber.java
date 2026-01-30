import java.util.Scanner;

public class CubeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cube = sc.nextInt();
        if (isCube(cube, 1)) {
            System.out.println("Cube");
        } else {
            System.out.println("Not Cube");
        }
    }

    static boolean isCube(int cube, int num) {
        if (num * num * num > cube) {
            return false;
        }
        if (num * num * num == cube) {
            return true;
        }
        return isCube(cube, num + 1);
    }

}
