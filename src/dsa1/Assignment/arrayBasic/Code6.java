import java.util.Scanner;

public class Code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Start and End");
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        for (int i = 0; i < size; i++) {
            if (arr[i] >= start && arr[i] <= end) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
