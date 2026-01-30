public class BubbleSort {
    public static void main(String[] args) {
        // int arr[] = new int[] { 7, 3, 9, 4, 2, 5, 6 };
        // int arr[] = new int[] { 2, 3, 4, 5, 6, 7, 9 };
        int arr[] = new int[] { 2, 3, 4, 5, 6, 9, 7 };
        int count = 0;
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                count++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(count);
    }
}
