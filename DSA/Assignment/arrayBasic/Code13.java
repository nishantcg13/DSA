import java.util.Scanner;

public class Code13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        unique(arr);

    }

    static void unique(int arr[]) {
        int length = arr.length;
        int unique = 0;
        for (int i = 0; i < length; i++) {
            unique ^= arr[i];
        }
        System.out.println(unique);
    }
}
