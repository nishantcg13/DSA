public class recursion2 {
    public static void main(String[] args) {
        System.out.println("Start Main");
        int rec = fun(2);
        System.out.println(rec);
        System.out.println("End Main");
    }

    static int fun(int num) {
        if (num == 0) {
            return 1;
        }
        // WIRITNG LIKE THIS WILL PRINT----> 2 1
        // System.out.println(num);
        // fun(--num);

        // WRITING LIKE THIS WILL PRINT----> 0 1
        // fun(--num);
        // System.out.println(num);

        return 5 + fun(--num);

    }
}
