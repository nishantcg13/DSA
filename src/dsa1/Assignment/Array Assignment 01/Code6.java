import java.util.Scanner;

public class Code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        productArray(arr);
        sc.close();
    }

    static void productArray(int arr[]) {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int product[] = new int[arr.length];

        left[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        right[arr.length - 1] = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            product[i] = left[i] * right[i];
        }

        for (int num : product) {
            System.out.print(num + " ");
        }
    }
}
