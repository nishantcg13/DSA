/*
 * Given an array of size N
 * A. Print the sum of every single subarray
 * B. print the sum of every single subarray using prefix sum technique
 * C. print the sum of every single subarray with Time complexity O(N) and space complexity O(1) . (Carry Forward)
 */

public class sumofSubEle {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 4, 1, 3 };

        // APPROACH A ---->
        /*
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = i; j < arr.length; j++) {
         * int sum = 0;
         * for (int k = i; k <= j; k++) {
         * sum += arr[k];
         * }
         * System.out.println(sum);
         * }
         * }
         */

        // APPROACH B
        int subArr[] = new int[arr.length];
        subArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            subArr[i] = subArr[i - 1] + arr[i];
        }
        /*
         * for (int num : subArr) {
         * System.out.print(num + " ");
         * }
         */

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                if (i == 0) {
                    System.out.println(subArr[j]);
                } else {
                    sum = sum + (subArr[j] - subArr[i - 1]);
                }
                if (i != 0) {
                    System.out.println(sum);
                }
            }
        }
    }
}
