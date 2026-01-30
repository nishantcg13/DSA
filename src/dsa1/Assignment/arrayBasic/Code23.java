import java.util.Scanner;

public class Code23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        smallest(arr);
    }

    static void smallest(int arr[]) {
        int length = arr.length;
        int min = arr[0];
        int min2 = arr[0];
        for (int i = 0; i < length; i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
            } else if (arr[i] < min2 && arr[i] != min) {
                min2 = arr[i];
            }

        }
        System.out.println(min);
        System.out.println(min2);
    }
}
