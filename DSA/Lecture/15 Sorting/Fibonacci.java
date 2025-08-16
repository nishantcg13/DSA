public class Fibonacci {
    public static void main(String[] args) {
        int num = 8;
        int ret = fibo(num);
        System.out.println(ret);
    }

    static int fibo(int num) {
        if (num <= 1) {
            return num;
        }
        return fibo(num - 1) + fibo(num - 2);
    }
}
