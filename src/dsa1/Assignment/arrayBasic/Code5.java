import java.util.Scanner;

public class Code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        sc.close();
        char arr[] = String.valueOf(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                arr[i] = '5';
            }
        }
        String newString = new String(arr);
        num = Integer.parseInt(newString);
        System.out.println("Num is : " + num);
    }
}
