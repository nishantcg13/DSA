import java.util.Scanner;

public class swapValues {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        swap(num, num2);
    }

    static void swap(int num, int num2) {
        int temp = num;
        num = num2;
        num2 = temp;
        System.out.println(num2);
        System.out.println(num);

        // WITHOUT USING THE THIRD VARIABLE
        int x = num;
        int y = num2;
        x = x + y;
        y = x - y;
        x = x - y;

    }

}
