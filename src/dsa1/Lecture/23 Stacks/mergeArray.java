import java.util.Stack;

class Solution {
    public static Stack<Integer> StackMergeStack(Stack<Integer> s1, Stack<Integer> s2) {
        Stack<Integer> result = new Stack<>();
        while (!s1.isEmpty() && !s2.isEmpty()) {

        }
        return result;
    }
}

public class mergeArray {
    public static void main(String[] args) {
        // example usage
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s2.push(3);
        s2.push(4);
        Stack<Integer> merged = Solution.StackMergeStack(s1, s2);
        System.out.println(merged);
    }
}
