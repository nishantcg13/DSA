/*Given an array of size N. print all the elements in a given subarray froom start to end.*/

public class subArray {
    public static void main(String[] args) {
        int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int start = 3;
        int end = 7;
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
