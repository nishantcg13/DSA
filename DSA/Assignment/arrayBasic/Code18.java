import java.util.Scanner;

public class Code18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target Sum : ");
        int targetSum = sc.nextInt();
        subArraySum(arr, targetSum);
    }

    static void subArraySum(int arr[], int targetSum) {
        int sum = 0;
        int start = 0;
        int length = arr.length;
        for (int end = 0; end < length; end++) {
            sum += arr[end];
            while (sum > targetSum && start < end) {
                sum -= arr[start++];
            }
            if (sum == targetSum) {
                System.out.println("Sum found betweeen " + start + " to " + end);
            }
        }
    }
}
