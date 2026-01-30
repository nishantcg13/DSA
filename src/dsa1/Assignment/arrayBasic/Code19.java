import java.util.*;

public class Code19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array 1:");
        int size1 = sc.nextInt();
        Integer arr1[] = new Integer[size1];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the Size of the array 2:");
        int size2 = sc.nextInt();
        Integer arr2[] = new Integer[size2];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.print("Enter the Size of the array :");
        int size3 = sc.nextInt();
        Integer arr3[] = new Integer[size3];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size3; i++) {
            arr3[i] = sc.nextInt();
        }
        commonEle(arr1, arr2, arr3);
    }

    static void commonEle(Integer arr1[], Integer arr2[], Integer arr3[]) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(arr3));
        Set<Integer> result = new HashSet<>();
        for (Integer num : set1) {
            if (set2.contains(num) && set3.contains(num)) {
                result.add(num);
            }
        }
        System.out.println(result);
    }
}
