public class MergeSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 9, 7, 5, 3, 4, 6, 8 };
        int start = 0;
        int end = arr.length - 1;

        sort(arr, start, end);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void Merge(int arr[], int start, int mid, int end) {
        int left = mid - start + 1;
        int right = end - mid;

        int arr1[] = new int[left];
        int arr2[] = new int[right];

        for (int i = 0; i < left; i++) {
            arr1[i] = arr[start + i];
        }

        for (int j = 0; j < right; j++) {
            arr2[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = start;

        while (i < left && j < right) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < left) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < right) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            sort(arr, start, mid);
            sort(arr, mid + 1, end);

            Merge(arr, start, mid, end);
        }
    }
}
