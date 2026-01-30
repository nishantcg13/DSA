public class BubbleRecursion {
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 3, 9, 4, 2, 5, 6 };
        int n = arr.length;
        bubble(arr, n);
    }

    static void bubble(int arr[], int n) {
        for (int j = 0; j < n; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        bubble(arr, n - 1);
    }
}
