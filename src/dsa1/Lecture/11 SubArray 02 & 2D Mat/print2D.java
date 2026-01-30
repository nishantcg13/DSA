public class print2D {

    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        // PRINT BY ROW
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + "\t");
        // }
        // System.out.println();
        // }

        // PRINT BY COLUMN
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }

        // PRINT ARRAY ROW SUM
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
        }

        // PRINT ARRAY COLUMN SUM
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println(sum);
        }

        // SUM OF ENTIRE MATRIX
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);

        // PRINT LEFT DIAGONAL
        int arr1[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i][i] + " ");
        }

        // PRINT RIGHT DIAGONAL
        System.out.println();
        int jInd = arr1.length - 1;
        int iInd = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[iInd][jInd]);
            iInd++;
            jInd--;

        }
    }
}
