import java.util.Scanner;

class Solution {
    int maxSize;
    int stackArr[];
    int top = -1;

    Solution(int size) {
        this.stackArr = new int[size];
        this.maxSize = size;
    }

    void push(int data) {

        if (top - 1 == maxSize) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stackArr[top] = data;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Already Empty");
            return -1;
        } else {
            int val = stackArr[top];
            top--;
            return val;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Already Empty");
            return -1;
        } else {
            int val = stackArr[top];
            return val;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void printStack() {
        System.out.print("[");
        for (int i = 0; i < top; i++) {
            System.out.print(stackArr[i] + ",");
        }
        System.out.print(stackArr[top] + "]");
        System.out.println();
    }
}

public class stackUsingArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stack Size: ");
        int size = sc.nextInt();
        char ch;
        Solution st = new Solution(size);

        do {
            System.out.println("Enter your choice");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.size");
            System.out.println("5.isEmpty");
            System.out.println("6.Print");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the element to add:");
                    int data = sc.nextInt();
                    st.push(data);
                    break;
                }
                case 2: {
                    System.out.println(st.pop());
                    break;
                }
                case 3: {
                    System.out.println(st.peek());
                    break;
                }
                case 4: {
                    System.out.println(st.top + 1);
                    break;
                }
                case 5: {
                    System.out.println(st.isEmpty());
                }
                case 6: {
                    st.printStack();
                    break;
                }

                default:
                    break;

            }

            System.out.println("Do you want to continue? (y/n)");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

    }

    
}
