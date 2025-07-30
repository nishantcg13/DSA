import java.util.Scanner;

public class Code39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        leaders(arr);
    }

    static void leaders(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            boolean isLeader = false;
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    isLeader = true;
                } else {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[length - 1]);
    }
}
