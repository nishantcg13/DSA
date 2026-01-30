public class Equilibrium {
    public static void main(String[] args) {
        int arr[] = new int[] { -7, 1, 5, 2, -4, 3, 0 };
        int N = arr.length;

        // BRUTE FORCCE APPROACH
        /*
         * for (int i = 0; i < N; i++) {
         * int leftSum = 0, rightSum = 0;
         * for (int j = 0; j < i; j++) {
         * leftSum += arr[j];
         * }
         * 
         * for (int j = i + 1; j < N; j++) {
         * rightSum += arr[j];
         * }
         * 
         * if (leftSum == rightSum) {
         * System.out.println(i);
         * break;
         * }
         * }
         */
        int prefixSum[] = new int[N];
        prefixSum[0] = arr[0];
        for (int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        /*
         * for (int num : prefixSum) {
         * System.out.print(num + " ");
         * }
         */
        int totalSum = prefixSum[N - 1];
        for (int i = 0; i < N; i++) {
            int leftSum = (i == 0) ? 0 : prefixSum[i - 1];
            if (totalSum - prefixSum[i] == leftSum) {
                System.out.println(i);
                break;
            }
        }
    }
}
