public class MergeSortBasic {
    public static void main(String[] args) {
        int arr[] = new int[] { 9, 1, 8, 2, 7, 3, 6, 4 };
        int start = 0;
        int end = arr.length - 1;
        MergeSort(arr, start, end);
    }

    static void MergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            System.out.println("Start: " + start + " Mid: " + mid + " End: " + end);
            MergeSort(arr, start, mid);
            MergeSort(arr, mid + 1, end);
        }
    }
}
