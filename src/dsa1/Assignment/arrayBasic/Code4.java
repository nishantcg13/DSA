import java.util.Scanner;

public class Code4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start element");
        int start = sc.nextInt();
        System.out.print("Enter end element");
        int end = sc.nextInt();
        sc.close();
        int multi = 1;
        int arr[] = new int[(end - start + 1)];
        System.out.println("Arr: " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = end - start + i;
        }
        for (int i = 0; i < arr.length; i++) {
            multi = arr[i] * multi;
        }
        System.out.println(multi);

    }
}
