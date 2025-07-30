import java.util.*;

public class Code32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        maxSum(arr);
    }

    static void maxSum(int arr[]) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * i;
        }
        System.out.println("Sum:" + sum);
    }
}
