import java.util.*;

public class Code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // for (int i = str.length() - 1; i >= 0; i--) {
        // System.out.print(str.charAt(i));
        // }
        reverse(str, str.length() - 1);
    }

    static void reverse(String str, int pointer) {
        if (pointer <= 0) {
            System.out.print(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(pointer));
        reverse(str, pointer - 1);
    }
}
