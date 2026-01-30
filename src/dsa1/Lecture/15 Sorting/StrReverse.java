public class StrReverse {
    public static void main(String[] args) {
        String str = "core2web";
        reverseStr(str, str.length() - 1);
    }

    static void reverseStr(String str, int ptr) {
        if (ptr == -1) {
            return;
        }
        System.out.print(str.charAt(ptr));
        reverseStr(str, ptr - 1);
    }
}
