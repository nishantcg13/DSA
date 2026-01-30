import java.util.Scanner;

class Node {
    Node previous = null;
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class DoublyCircularLinkedList {
    Node head = null;

    void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            newNode.previous = newNode;
        } else {
            Node temp = head;
            head = newNode;
            temp.previous = newNode;
            temp.next.next = newNode;
            head.previous = temp.next.next;
            head.next = temp;
        }
    }

    void addLast(int data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            Node newNode = new Node(data);
            temp.next = newNode;
            newNode.previous = temp;
            newNode.next = head;
            head.previous = newNode;
        }
    }

    void addAtPos(int pos, int data) {

        if (head == null) {
            addFirst(data);
        } else if (pos == countNode() + 1) {
            addLast(data);
        } else {
            Node temp = head;
            Node newNode = new Node(data);
            while (pos - 2 != 0) {
                pos--;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.previous = temp;
            newNode.next.previous = newNode;
        }
    }

    void deleteFirst() {

        if (head == null) {
            System.out.println("Linked List already empty");
        } else if (countNode() == 1) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
            head.previous = temp;

        }

    }

    void deleteLast() {
        if (head == null) {
            System.out.println("Linked List already empty");
        } else if (countNode() == 1) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != head) {
                temp = temp.next;
            }

            temp.next = head;
            head.previous = temp;
        }
    }

    void deleteAtPos(int pos) {

        if (head == null) {
            System.out.println("Linked List already empty");
            return;
        }

        if (pos == 1) {
            deleteFirst();
        } else if (pos == countNode() + 1) {
            deleteLast();
        } else {
            Node temp = head;

            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }

            temp.next = temp.next.next;
            temp.next.next.previous = temp;
        }

    }

    int countNode() {
        int count = 0;
        Node temp = head;
        if (null == head) {
            return 0;
        } else {

            while (temp.next != head) {
                temp = temp.next;
                count++;
            }
            return count + 1;
        }
    }

    void printDCLL() {
        Node temp = head;

        while (temp.next != head) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.print(temp.data);
        System.out.println();
    }
}

public class DoublyCircularLL {
    public static void main(String[] args) {
        DoublyCircularLinkedList scll = new DoublyCircularLinkedList();
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter your choice");
            System.out.println("1.Add First");
            System.out.println("2.Add Last");
            System.out.println("3.Add At Position");
            System.out.println("4.Delete First");
            System.out.println("5.Delete Last");
            System.out.println("6.Delete At Position");
            System.out.println("7.Count Node");
            System.out.println("8.Print Doubly Circular Linked List");
            int choice = sc.nextInt();
            int data;
            switch (choice) {
                case 1:

                    System.out.println("Enter Data");
                    data = sc.nextInt();
                    scll.addFirst(data);
                    break;

                case 2:

                    System.out.println("Enter Data");
                    data = sc.nextInt();
                    scll.addLast(data);
                    break;

                case 3:

                    System.out.println("Enter Data");
                    int pos = sc.nextInt();
                    data = sc.nextInt();
                    scll.addAtPos(pos, data);
                    break;

                case 4:

                    scll.deleteFirst();
                    break;

                case 5:

                    scll.deleteLast();
                    break;

                case 6:

                    System.out.println("Enter position");
                    pos = sc.nextInt();
                    scll.deleteAtPos(pos);
                    break;

                case 7:

                    System.out.println(scll.countNode());
                    break;

                case 8:

                    scll.printDCLL();
                    System.out.println();
                    break;

                default:
                    break;

            }

            System.out.println("Do you want to continue? (y/n)");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        System.out.println("Thank You!!!!!");
        sc.close();
    }
}
