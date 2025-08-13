public class sumOfN {
    public static void main(String[] args) {
        int sum = fun(5);
        System.out.println(sum);
    }

    static int fun(int num) {
        if (num == 0) {
            return 0;
        }
        return num + fun(--num);
        
    }
}
 