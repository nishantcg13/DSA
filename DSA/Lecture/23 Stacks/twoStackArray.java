import java.util.Scanner;

class Solution {
    int size;
    int arr[];
    int top1;
    int top2;

    Solution(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    void push1(int data1) {
        if (top2 - top1 > 1) {
            top1++;
            arr[top1] = data1;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    void push2(int data2) {
        if (top2 - top1 > 1) {
            top2--;
            arr[top2] = data2;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    int pop1() {
        if (top1 == -1) {
            System.out.println("Stack already empty");
            return -1;
        } else {
            int val = arr[top1];
            --top1;
            return val;
        }
    }

    int pop2() {
        if (top2 == size) {
            System.out.println("Stack already empty");
            return -1;
        } else {
            int val = arr[top2];
            ++top1;
            return val;
        }
    }

    int peek1() {
        return arr[top1];
    }

    int peek2() {
        return arr[top2];
    }

    boolean isEmpty1() {
        if (top1 == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty2() {
        if (top2 == size) {
            return true;
        } else {
            return false;
        }
    }

    void printStack1() {

        System.out.print("[");
        for (int i = 0; i < top1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[top1] + "]");
    }

    void printStack2() {
        System.out.print("[");
        for (int i = size - 1; i > top2; i--) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[top2] + "]");
    }
}

public class twoStackArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stack Size: ");
        int size = sc.nextInt();

        Solution st = new Solution(size);
        char ch;

        do {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Push in Stack 1");
            System.out.println("2. Push in Stack 2");
            System.out.println("3. Pop 1");
            System.out.println("4. Pop 2");
            System.out.println("5. Peek 1");
            System.out.println("6. Peek 2");
            System.out.println("7. isEmpty 1");
            System.out.println("8. isEmpty 2");
            System.out.println("9. Print 1");
            System.out.println("10. Print 2");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to add:");
                    int data1 = sc.nextInt();
                    st.push1(data1);
                    break;

                case 2:
                    System.out.println("Enter the element to add:");
                    int data2 = sc.nextInt();
                    st.push2(data2);
                    break;

                case 3:
                    int popped1 = st.pop1();
                    if (popped1 != -1)
                        System.out.println("Popped: " + popped1);
                    break;

                case 4:
                    int popped2 = st.pop2();
                    if (popped2 != -1)
                        System.out.println("Popped: " + popped2);
                    break;

                case 5:
                    int peeked1 = st.peek1();
                    if (peeked1 != -1)
                        System.out.println("Top element: " + peeked1);
                    break;

                case 6:
                    int peeked2 = st.peek2();
                    if (peeked2 != -1)
                        System.out.println("Top element: " + peeked2);
                    break;

                case 7:
                    System.out.println(st.isEmpty1() ? "Stack is empty" : "Stack is not empty");
                    break;

                case 8:
                    System.out.println(st.isEmpty2() ? "Stack is empty" : "Stack is not empty");
                    break;

                case 9:
                    st.printStack1();
                    break;
                case 10:
                    st.printStack2();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("\nDo you want to continue? (y/n)");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        sc.close();
    }
}
