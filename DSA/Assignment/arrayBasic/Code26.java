import java.util.Scanner;

public class Code26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        ele(arr);
    }

    static void ele(int arr[]) {
        int length = arr.length;
        int arr1[] = new int[length];
        for (int i = 0; i < length; i++) {
            if (arr[i] > 0) {
                arr1[i] = arr[i];
                arr[i] = 0;
            }
        }
        for (int i = 0; i < length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }

            if (arr1[i] > 0) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
