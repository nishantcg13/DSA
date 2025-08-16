import java.util.Scanner;

public class perfecctNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int newnum = num;
        int ret = perfect(num, newnum);
        if (newnum == ret)
            System.out.println("Strong Number " + ret);
    }

    static int perfect(int num, int newnum) {
        if (num == 0)
            return 0;
        if (newnum % num == 0 && newnum != num)
            return num + perfect(num - 1, newnum);
        return perfect(num - 1, newnum);
    }
}
