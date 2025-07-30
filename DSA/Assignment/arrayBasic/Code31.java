import java.util.Scanner;

public class Code31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sum(arr);
    }

    static void sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    sum = (arr[i] - arr[j]) + sum;
                }
            }
        }
        System.out.println("Sum : " + sum);
    }
}
