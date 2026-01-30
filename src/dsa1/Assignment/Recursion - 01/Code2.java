public class Code2 {
    public static void main(String[] args) {
        // for (int i = 10; i >= 1; i--) {
        // System.out.println(i);
        // }
        number(1);
    }

    static void number(int num) {
        if (num > 10) {
            return;
        }
        number(num + 1);
        System.out.println(num);
    }
}
