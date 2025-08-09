public class spiral {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        int N = arr.length;

        int i = 0, j = 0;
        while (N > 1) {
            for (int x = 0; x < N - 1; x++) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            for (int x = 0; x < N - 1; x++) {
                System.out.print(arr[i][j] + " ");
                i++;
            }
            for (int x = 0; x < N - 1; x++) {
                System.out.print(arr[i][j] + " ");
                j--;
            }
            for (int x = 0; x < N - 1; x++) {
                System.out.print(arr[i][j] + " ");
                i--;
            }
            N -= 2;
            i++;
            j++;
        }
        if (N == 1) {
            System.out.println(arr[i][j]);
        }
    }
}
