import java.util.Scanner;

public class Code33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sum(arr);
    }

    static void sum(int arr[]) {
        int length = arr.length;
        int mid = (arr.length + 1) / 2;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < length; i++) {
            if (i < mid) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }
        System.out.println("Prod is " + sum1 * sum2);
    }
}
