public class subArray {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 1, 3, 4, 6, 4, 6, 3 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int minLength = Integer.MAX_VALUE;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                for (int j = 0; j < arr.length; j++) {
                    if (max == arr[j]) {
                        len = j - i + 1;
                        if (minLength < len) {
                            minLength = len;
                        }
                    }
                }
            }
            if (max == arr[i]) {
                for (int j = 0; j < arr.length; j++) {
                    if (min == arr[j]) {
                        len = j - i + 1;
                        if (minLength < len) {
                            minLength = len;
                        }
                    }
                }
            }
        }
        System.out.println(len);
    }
}
