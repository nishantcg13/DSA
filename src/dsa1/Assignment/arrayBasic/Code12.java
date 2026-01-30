import java.util.Scanner;

public class Code12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Element you want to find");
        int ele = sc.nextInt();
        occurence(arr, ele);

    }

    static void occurence(int arr[], int ele) {
        int length = arr.length;
        int firstoccurence = -1;
        int lastoccurence = -1;
        for (int i = 0; i < length; i++) {
            if (arr[i] == ele && firstoccurence == -1) {
                firstoccurence = i;
            }
            if (arr[i] == ele) {
                lastoccurence = i;
            }
        }
        if (firstoccurence != lastoccurence) {
            System.out.println("First Occured : " + firstoccurence + " lastOccured : " + lastoccurence);
        } else {
            System.out.println("-1");
        }

    }
}
