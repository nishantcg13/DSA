import java.util.Arrays;
import java.util.Scanner;

public class Code35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target number: ");
        int target = sc.nextInt();
        minProd(arr, target);
    }

    static void minProd(int arr[], int target) {
        Arrays.sort(arr);
        int product = 1;
        for (int i = 0; i < target; i++) {
            product *= arr[i];
        }
        System.out.println("Product: " + product);
    }
}