public class overflow {
    public static void main(String[] args) {
        fun(1);
    }

    // this code gives stack overflow
    static void fun(int num) {
        System.out.println(num);
        fun(++num);
    }
}
