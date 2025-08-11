import java.util.*;

// count subarrray of length k
public class ksubArray {
    public static void main(String[] args) {
        int arr[] = new int[] { -3, 4, -2, 5, 3, -2, 8, 2, 1, 4 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        // BRUTE FORCE APPROACH
        int end = k - 1;
        int count = 0;
        while (end < arr.length) {
            count++;
            end++;
        }
        System.out.println(count);
        // O(N)

        // OPTIMISED CODE
        System.out.println(arr.length - k + 1); // O(1)
    }
} 
