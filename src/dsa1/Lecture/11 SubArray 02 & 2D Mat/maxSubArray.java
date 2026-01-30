public class maxSubArray {
    public static void main(String[] args) {
        int arr[] = new int[] { -10, 2, 3, -1, 5 };

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                tempStart = i;
            }
            sum = sum + arr[i];
            if (sum < 0) {
                sum = 0;

            }
            if (sum > maxSum) {
                maxSum = sum;
                end = i;
                start = tempStart;
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(maxSum);
    }
}
