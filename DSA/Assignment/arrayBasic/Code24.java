import java.util.Scanner;

public class Code24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        ceil(arr, num);
    }

    static void ceil(int arr[], int num) {
        int ceil = -1, floor = -1;
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] + 1 == num) {
                floor = arr[i];
                if (arr[i + 1] - 1 == num) {
                    ceil = arr[i + 1];
                    break;
                }
            }
        }
        System.out.println("Floor of " + num + " is " + floor + " and ceil of " + num + " is " + ceil);

    }
}
