import java.util.Scanner;

public class KsubArraySum {
    public static void main(String[] args) {

        int arr[] = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        // APPROACH USING 2 LOOPS
        // int end = k - 1;
        // int start = 0;
        // int maxSum = Integer.MIN_VALUE;
        // while (end < arr.length) {
        // int sum = 0;
        // for (int i = start; i <= end; i++) {
        // sum += arr[i];
        // }
        // System.out.println(sum);
        // start++;
        // end++;
        // if (sum > maxSum) {
        // maxSum = sum;
        // }
        // }
        // System.out.println(maxSum);

        // APPROACH USING PREFIX SUM

        int prefArr[] = new int[arr.length];
        prefArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefArr[i] = prefArr[i - 1] + arr[i];
        }

        // for (int num : prefArr) {
        // System.out.print(num + " ");
        // }
        int end = k - 1;
        int start = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while (end < arr.length) {

            if (start == 0) {
                sum = prefArr[end];
            } else {
                sum = prefArr[end] - prefArr[start - 1];
            }
            start++;
            end++;

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);

        // Time Complexity : O((N-K)*K)
    }
}
