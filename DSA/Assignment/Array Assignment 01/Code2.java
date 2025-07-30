import java.util.Scanner;

public class Code2 {
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
        int target = sc.nextInt();
        findNum(arr, size, target);
        sc.close();
    }

    static void findNum(int arr[], int size, int target) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("Count is: " + count);
    }

}
