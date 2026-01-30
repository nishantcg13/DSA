import java.util.Stack;

public class InbuildStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();

        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        st.add(50);

        System.out.println(st);

        System.out.println(
                st.peek());

        System.out.println(st.remove(4));
        System.out.println(st);

        System.out.println(st.isEmpty());
    }
}
