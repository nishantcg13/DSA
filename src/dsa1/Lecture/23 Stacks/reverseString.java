import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        char arr[] = new char[str.length()];
        int i = 0;
        while (!st.empty()) {
            arr[i] = st.pop();
            i++;
        }

        System.out.println(arr);
    }
}
