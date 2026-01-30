public class Code1 {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }
        number(10);
    }

    static void number(int num) {
        if (num == 0) {
            return;
        }

        number(num - 1);
        System.out.println(num);
    }
}
