import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index you want to remove element");
        int ind = sc.nextInt();
        removeatInd(arr, ind);

    }

    static void removeatInd(int[] arr, int index) {
        int length = arr.length;
        for (int i = index; i < length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
