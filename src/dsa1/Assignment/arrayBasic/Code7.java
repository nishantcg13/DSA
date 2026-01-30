import java.util.Scanner;

public class Code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[] = new int[10];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            int digits = sc.nextInt();
            arr[digits]++;
        }

        for (int i = 9; i > 0; i--) {
            while (arr[i] > 0) {
                System.out.print(i);
                arr[i]--;
            }
        }

    }
}
