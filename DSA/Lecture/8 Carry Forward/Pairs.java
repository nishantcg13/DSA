public class Pairs {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'e', 'g', 'a', 'g' };
        int length = arr.length;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int itr1 = 0;
        int itr2 = 0;
        int itr3 = 0;
        // BRUTE FORCE APPROACH ---> O(N2)
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i + 1; j++) {
                itr1++;
                if (arr[i] == 'a' && arr[j] == 'g') {
                    count1++;
                }
            }
        }
        System.out.println(itr1);

        // OPTIMISED APPROACH - BUT NO THAT SO ---> O(N2)
        for (int i = 0; i < length; i++) {
            if (arr[i] == 'a') {
                for (int j = 0; j < i + 1; j++) {
                    itr2++;
                    if (arr[j] == 'g') {
                        count2++;
                    }
                }
            }

        }
        System.out.println(itr2);

        // BEST OPTIMISED APPROACH O(N)
        int pairFound = 0;
        for (int i = 0; i < length; i++) {
            itr3++;
            if (arr[i] == 'a') {
                count3++;
            } else if (arr[i] == 'g') {
                pairFound += count3;
            }
        }
        System.out.println(pairFound);
        System.out.println(itr3);
    }
}