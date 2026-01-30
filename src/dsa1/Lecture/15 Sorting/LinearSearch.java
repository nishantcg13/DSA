import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the  number to search: ");
        int num = sc.nextInt();
        int ret = search(arr, num);
        if (ret != -1) {
            System.out.println("Index " + ret);
        } else {
            System.out.println("-1");
        }
    }

    static int search(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
