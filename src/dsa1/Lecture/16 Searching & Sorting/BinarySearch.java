import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[] { 4, 7, 11, 24, 37, 55, 75, 87 };
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int index = binarySearch(arr, search, start, end);
        if (index != -1) {
            System.out.println("Element Found at Index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
    // USING LOOPS
    // static int binarySearch(int arr[], int search) {
    // int start = 0;
    // int end = arr.length;
    // while (start <= end) {
    // int mid = (start + end) / 2;

    // if (arr[mid] == search) {
    // return mid;
    // }
    // if (arr[mid] < search) {
    // start = mid + 1;
    // }
    // if (arr[mid] > search) {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }
    // USING RECURSION
    static int binarySearch(int arr[], int search, int start, int end) {
        int mid = (start + end) / 2;

        
        if (start <= end) {
            if (arr[mid] == search) {
                return mid;
            }
            if (arr[mid] > search) {
                return binarySearch(arr, search, start, mid - 1);
            }
            if (arr[mid] < search) {
                return binarySearch(arr, search, mid + 1, end);
            }
        }

        return -1;
    }
}
