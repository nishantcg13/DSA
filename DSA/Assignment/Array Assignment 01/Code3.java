import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target Element: ");
        System.out.println("Enter the number of range sum queries?");
        int numQueries = sc.nextInt();
        int arr1[][] = new int[numQueries][2];
        for (int i = 0; i < numQueries; i++) {
            System.out.println("Enter query: " + i);
            for (int j = 0; j < 1; j++) {
                System.out.println("Enter element: 1");
                int ele1 = sc.nextInt();
                System.out.println("Enter element: 2");
                int ele2 = sc.nextInt();
                arr1[i][0] = ele1;
                arr1[i][1] = ele2;
            }
        }
        rangeSum(arr, arr1, numQueries);
        sc.close();
    }

    static void rangeSum(int arr[], int arr1[][], int numQueries) {
        int newArray[] = new int[arr.length];
        int sum = 0;
        newArray[0] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
            newArray[i] = sum;
        }
        int range[] = new int[numQueries];
        for (int i = 0; i < numQueries; i++) {
            int L = arr1[i][0];
            int R = arr1[i][1];
            if (L == 0) {
                range[i] = newArray[R];
            } else {
                range[i] = newArray[R] - newArray[L - 1];
            }
        }
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : range) {
            System.out.print(num + " ");
        }
    }
}
