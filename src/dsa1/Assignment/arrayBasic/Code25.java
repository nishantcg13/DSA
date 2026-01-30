import java.util.Scanner;

public class Code25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        maxProd(arr);
    }

    static void maxProd(int[] arr) {
        int prod = arr[0];
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] * arr[i + 1] > prod) {
                prod = arr[i] * arr[i + 1];
            }
        }
        System.out.println("Max Product: " + prod);
    }
}
