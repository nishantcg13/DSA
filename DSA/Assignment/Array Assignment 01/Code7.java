import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        leaders(arr);
        sc.close();
    }

    static void leaders(int arr[]) {
        List<Integer> leadersArray = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
                leadersArray.add(max);
            }
        }
        Collections.reverse(leadersArray);
        System.out.println("Leaders " + leadersArray);
    }
}
