import java.util.Scanner;

public class Code16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = new String(sc.nextLine());
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                index = i;
            }
        }
        System.out.println(index);
    }
}
