import java.util.Scanner;

class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class StackLL {
    int maxSize;
    Node head = null;
    int top = -1;

    StackLL(int size) {
        maxSize = size;
    }

    void push(int data) {
        if (top + 1 == maxSize) {
            System.out.println("Stack Overflow — cannot push " + data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        top++;
        System.out.println(data + " pushed successfully");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow — Stack is already empty");
            return -1;
        } else {
            int element = head.data;
            head = head.next;
            top--;
            return element;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty — nothing to peek");
            return -1;
        } else {
            return head.data;
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    void printStack() {
        if (isEmpty()) {
            System.out.println("[] (Stack is empty)");
            return;
        }

        Node temp = head;
        System.out.print("[");
        while (temp.next != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.print(temp.data + "]");
        System.out.println();
    }
}

public class stackUsingLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Stack Size: ");
        int size = sc.nextInt();

        StackLL stLL = new StackLL(size);
        char ch;

        do {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. Print");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to add:");
                    int data = sc.nextInt();
                    stLL.push(data);
                    break;

                case 2:
                    int popped = stLL.pop();
                    if (popped != -1)
                        System.out.println("Popped: " + popped);
                    break;

                case 3:
                    int peeked = stLL.peek();
                    if (peeked != -1)
                        System.out.println("Top element: " + peeked);
                    break;

                case 4:
                    System.out.println("Current stack size: " + (stLL.top + 1));
                    break;

                case 5:
                    System.out.println(stLL.isEmpty() ? "Stack is empty" : "Stack is not empty");
                    break;

                case 6:
                    stLL.printStack();
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
