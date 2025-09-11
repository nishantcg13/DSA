// MERGE SORT 

public class MergeSortBasic {
    public static void main(String[] args) {
        int arr[] = new int[] { 9, 1, 8, 2, 7, 3, 6, 4 };
        int start = 0;
        int end = arr.length - 1;

        MergeSort(arr, start, end);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void Merge(int arr[], int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            arr2[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = start;

        // Merge the two arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    static void MergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            MergeSort(arr, start, mid);
            MergeSort(arr, mid + 1, end);

            Merge(arr, start, mid, end);
        }
    }
}
