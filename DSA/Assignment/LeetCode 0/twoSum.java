import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the array Elements: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        // BRUTE FORCE APPROACH
        // TC = O(N2)
        /*
         * for (int i = 0; i < size; i++) {
         * for (int j = i; j < size; j++) {
         * if (arr[i] + arr[j] == target) {
         * System.out.println("[" + i + "," + j + "]");
         * break;
         * }
         * }
         * }
         */

        // OPTITMISED APPROACH
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < size; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement) && map.get(complement) != i) {
                System.out.print(i + " " + map.get(complement));
                break;
            }
        }

    }
}
