import java.util.*;

public class Code28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        duplicates(arr);
    }

    static void duplicates(int[] arr) {
        SortedSet<Integer> newSet = new TreeSet();
        for (int i = 0; i < arr.length; i++) {
            newSet.add(arr[i]);
        }
        System.out.println(newSet);
    }
}
