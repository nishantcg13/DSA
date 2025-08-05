// Print all the diagonal elements R->L

public class printDiag {
    public static void main(String[] args) {

        int arr[][] = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
                { 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 } };
        int N = 5;
        int M = 6;       
        for (int j = M - 1; j >= 0; j--) {
            int i = 0;
            int y = j;
            while (i < N && y >= 0) {
                System.out.print(arr[i][y] + " ");
                i++;
                y--;
            }
            System.out.println();
        }
    }
}