import java.util.*;

public class Code15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        disticnt(arr);

    }

    static void disticnt(int arr[]) {
        Set<Integer> newSet = new HashSet<>();
        for (int num : arr) {
            newSet.add(num);
        }
        int sum = 0;
        for (int i : newSet) {
            sum += i;
        }
        System.out.println(sum);
    }
}
