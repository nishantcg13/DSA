public class recursion {
    public static void main(String[] args) {
        recursion obj = new recursion();
        obj.numPrint(10);
    }

    void numPrint(int num) {
        System.out.println(num);
        num--;
        if (num != 0) {

            numPrint(num);
        }
    }
}
