import java.util.Scanner;

public class Code17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array 1 Size");
        int size1 = sc.nextInt();
        int arr1[] = new int[size1];

        System.out.println("Enter Array 1 Elements");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Array 2 Size");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];

        System.out.println("Enter Array 2 Elements");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        product(arr1, arr2);

    }

    static void product(int arr1[], int arr2[]) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int max = arr1[0];
        int min = arr2[0];
        for (int i = 0; i < length1; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        for (int i = 0; i < length2; i++) {
            if (min > arr2[i]) {
                min = arr2[i];
            }
        }
        System.out.println("Product : " + min * max);
    }
}
