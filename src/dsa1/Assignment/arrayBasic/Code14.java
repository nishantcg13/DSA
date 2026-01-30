import java.util.*;
import java.util.Scanner;

public class Code14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Max Ele in the array");
        int k = sc.nextInt();
        repeat(arr, k);
    }

    static void repeat(int arr[], int k) {
        Map<Integer, Integer> freq = new HashMap<>(k);
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int maxFreq = 0;
        int mostFreqNum = arr[0];
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                if (entry.getKey() > mostFreqNum) {
                    mostFreqNum = entry.getKey();
                }
            }
        }
        System.out.println(mostFreqNum);
    }
}
