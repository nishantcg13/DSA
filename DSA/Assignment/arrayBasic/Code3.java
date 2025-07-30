import java.util.*;

public class Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maxx " + max);
    }
}
