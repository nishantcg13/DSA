public class boundary {
    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // MY APPROACH
        // for (int i = 0; i < arr.length -1 - 1; i++) {
        // System.out.print(arr[0][i] + " ");
        // }

        // for (int i = 0; i < arr.length -1 - 1; i++) {
        // System.out.print(arr[i][arr.length -1 - 1] + " ");
        // }

        // for (int i = arr.length -1 - 1; i > 0; i--) {
        // System.out.print(arr[arr.length -1 - 1][i] + " ");
        // }
        // for (int i = arr.length -1 - 1; i > 0; i--) {
        // System.out.print(arr[i][0] + " ");
        // }

        // SIR'S APPROACH
        int i = 0, j = 0;
        for (int x = 0; x < arr.length - 1; x++) {
            System.out.print(arr[i][j] + " ");
            j++;
        }
        for (int x = 0; x < arr.length - 1; x++) {
            System.out.print(arr[i][j] + " ");
            i++;
        }
        for (int x = 0; x < arr.length - 1; x++) {
            System.out.print(arr[i][j] + " ");
            j--;
        }
        for (int x = 0; x < arr.length - 1; x++) {
            System.out.print(arr[i][j] + " ");
            i--;
        }
    }
}
