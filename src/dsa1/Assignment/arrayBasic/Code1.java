import java.util.*;

public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.err.print("Enter the number you want to find:");
        int num = sc.nextInt();
        sc.close();
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                System.out.println("Element found at index " + i);
            }
        }

    }

}