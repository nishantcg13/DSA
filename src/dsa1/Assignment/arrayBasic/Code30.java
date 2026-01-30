import java.util.Scanner;

public class Code30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target number: ");
        int num = sc.nextInt();
        closest(arr, num);
    }

    static void closest(int arr[], int num) {
        int left = 0, right = arr.length - 1;
        int closest = arr[0];

        while (left <= right) {
            int mid = (left + right) / 2;

            // Update closest if current is closer to num
            if (Math.abs(arr[mid] - num) < Math.abs(closest - num)) {
                closest = arr[mid];
            }

            if (arr[mid] == num) {
                // Exact match found
                System.out.println("Closest Element is: " + arr[mid]);
                return;
            } else if (arr[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Closest Element is: " + closest);
    }

}
