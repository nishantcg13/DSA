public class MergeSortedArrays {
    public static void main(String[] args) {
        int arr1[] = new int[] { 3, 7, 9, 11 };
        int arr2[] = new int[] { 2, 5, 8 };
        int result[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            result[k] = arr1[j];
            j++;
            k++;
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
