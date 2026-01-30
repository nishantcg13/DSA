public class RecursionSelection {
    public static void main(String[] args) {
        int arr[] = new int[] { 9, 2, 7, 3, 1, 8, 4, 6 };
        Sort(arr, 0);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static int[] Sort(int arr[], int i) {
        if (i == arr.length) {
            return arr;
        }
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

        Sort(arr, i + 1);
        return arr;
    }
}