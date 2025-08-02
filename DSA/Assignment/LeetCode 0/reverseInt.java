import java.util.*;

public class reverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int newNum = 0;
        boolean flag = false;
        if (num < 0) {
            num = num * -1;
            flag = true;
        }
        while (num > 0) {
            int temp = num % 10;
            num /= 10;
            newNum = newNum * 10 + temp;
        }
        if (flag)
            System.out.println(newNum * -1);
        else
            System.out.println(newNum);

    }
}
