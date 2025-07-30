import java.util.Scanner;

public class Code37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        rearrange(arr);
    }

    static void rearrange(int[] arr) {
        int j = 0; // index for negative elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap negative number to the front
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
