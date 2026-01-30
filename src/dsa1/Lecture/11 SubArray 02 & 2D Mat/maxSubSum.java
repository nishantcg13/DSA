// Maximum Sub Array Sum
public class maxSubSum {
    public static void main(String[] args) {
        int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int maxSum = Integer.MIN_VALUE;

        // BRUTE FORCE APPROACH
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // int sum = 0;
        // for (int k = i; k <= j; k++) {
        // sum += arr[k];
        // }
        // if (sum > maxSum) {
        // maxSum = sum;
        // }
        // }
        // }
        // System.out.println(maxSum);

        // MORE OPTIMISSED USING CARRY FORWARD
        // for (int i = 0; i < arr.length; i++) {
        // int sum = 0;
        // for (int j = i; j < arr.length; j++) {
        // sum += arr[j];
        // if (sum > maxSum) {
        // maxSum = sum;
        // }
        // }
        // }

        // APPROACH USING PREFIX SUM
        // int prefArr[] = new int[arr.length];
        // prefArr[0] = arr[0];

        // for (int i = 1; i < arr.length; i++) {
        // prefArr[i] = prefArr[i - 1] + arr[i];
        // }

        // for (int num : prefArr) {
        // System.out.print(num + " ");
        // }
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {

        // if (i == 0) {
        // sum = prefArr[j];
        // } else {
        // sum = prefArr[j] - prefArr[i - 1];
        // }
        // if (sum > maxSum) {
        // maxSum = sum;
        // }
        // }
        // }

        // APPROACH USING KADANE'S ALGORITHM: ----->
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}
