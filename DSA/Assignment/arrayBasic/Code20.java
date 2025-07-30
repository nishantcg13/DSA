import java.util.Scanner;

public class Code20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target Sum: ");
        int target = sc.nextInt();
        twoSum(arr, target);
    }

    static void twoSum(int arr[], int target) {
        int length = arr.length;
        boolean found = false;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + target);
                    found = true;
                }
            }
            if (found)
                break;
        }
    }
}
