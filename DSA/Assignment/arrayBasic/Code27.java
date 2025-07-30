import java.util.Scanner;

public class Code27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Size of the array 2:");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter Array 2 Elements");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Enter target Sum: ");
        int targetSum = sc.nextInt();
        pairSum(arr, arr2, targetSum);
    }

    static void pairSum(int arr[], int arr2[], int targetSum) {
        int length1 = arr.length;
        int length2 = arr2.length;
        int left1 = 0, right1 = length1 - 1;
        boolean found1 = false;
        while (left1 < right1) {
            int sum = arr[left1] + arr[right1];
            if (sum == targetSum) {
                found1 = true;
                System.out.println("Pair found1: " + arr[left1] + " + " + arr[right1] + " = " + targetSum);
                break;
            } else if (sum < targetSum) {
                left1++;
            } else {
                right1++;
            }
            if (!found1) {
                System.out.println("Pair Not Found");
            }
        }
        int left2 = 0, right2 = length2 - 1;
        boolean found2 = false;
        while (left2 < right2) {
            int sum = arr2[left2] + arr2[right2];
            if (sum == targetSum) {
                found1 = true;
                System.out.println("Pair found: " + arr2[left2] + " + " + arr2[right2] + " = " + targetSum);
                break;
            } else if (sum < targetSum) {
                left2++;
            } else {
                right2++;
            }
            if (!found2) {
                System.out.println("Pair Not Found");
            }
        }

    }
}
