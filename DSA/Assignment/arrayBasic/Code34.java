import java.util.Scanner;

public class Code34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        pendulum(arr);
    }

    static void pendulum(int arr[]) {
        int length = arr.length;
        int[] result = new int[arr.length];
        int mid = (arr.length - 1) / 2;
        int left = mid, right = mid + 1;
        boolean toLeft = true;

        for (int i = 0; i < arr.length; i++) {
            if (toLeft) {
                result[left--] = arr[i];
            } else {
                result[right++] = arr[i];
            }
            toLeft = !toLeft;
        }
        for (int i = 0; i < length; i++) {
            System.out.println(result[i]);
        }
    }
}
