import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 12, 7, 6, 14, 5, 15, 10 };

    }

    static void Quick(int arr[], int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            Quick(arr, start, pivot - 1);
            Quick(arr, pivot + 1, end);
        }
    }

    static int partition(int arr[], int start, int end) {
        int pivot = arr[end];

        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }
}
