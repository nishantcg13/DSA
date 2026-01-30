import java.util.Scanner;

public class Code36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        peakElement(arr);
    }

    static void peakElement(int arr[]) {
        int length = arr.length;
        for (int i = 1; i < length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                System.out.println("Element Found: " + arr[i]);
                break;
            }
        }
    }
}
