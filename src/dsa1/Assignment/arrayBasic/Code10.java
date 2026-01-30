import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        oddSum(arr);

    }

    static void oddSum(int[] arr) {
        int sum = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
