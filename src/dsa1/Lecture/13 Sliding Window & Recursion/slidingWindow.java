import java.util.*;

// count subarrray of length k
public class slidingWindow {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;
        // USING SLIDING WINDOW
        int start = 0;
        int end = k - 1;
        for (int i = 0; i <= end; i++) {
            sum = sum + arr[i];
        }
        start = 1;
        end = k;
        int maxSum = sum;
        while (end < arr.length) {
            sum = sum - arr[start - 1] + arr[end];
            if (maxSum < sum) {
                maxSum = sum;
            }
            start++;
            end++;
        }
        System.out.print(maxSum);
    }
}
