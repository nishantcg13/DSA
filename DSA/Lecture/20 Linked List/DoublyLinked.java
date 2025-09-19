import java.util.Scanner;

class Node {
    int data;
    Node previous = null;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    Node head = null;

    void addFirst(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }

    }

    void printSLL() {

        if (head == null) {
            System.out.println("Linked List is Empty!!!");
        } else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print(temp.data);
            System.out.println();
        }

    }

    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            addFirst(data);
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
        }
    }

    void addAtPos(int pos, int data) {

    }

    void deleteFirst() {

    }

    void deleteLast() {

    }

    void deleteAtPos(int pos) {

    }

    int countNode() {
        Node temp = head;
        int count = 0;

        // if (temp == null) {
        // return 0;
        // }
        // salgya companies sangtat ki asa liha karan ki ashyane tumcha code readable
        // hoto ani nntr parat lavkar lakshyatt yeto and this is best coding practice

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

}

public class DoublyLinked {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
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
            System.out.println("8.Print Doubly Linked List");
            int choice = sc.nextInt();
            int data;
            switch (choice) {
                case 1:

                    System.out.println("Enter Data");
                    data = sc.nextInt();
                    dll.addFirst(data);
                    break;

                case 2:

                    System.out.println("Enter Data");
                    data = sc.nextInt();
                    dll.addLast(data);
                    break;

                case 3:

                    System.out.println("Enter Data");
                    data = sc.nextInt();
                    dll.addAtPos(choice, data);
                    break;

                case 4:

                    dll.deleteFirst();
                    break;

                case 5:

                    dll.deleteLast();
                    break;

                case 6:

                    System.out.println("Enter Position");
                    int pos = sc.nextInt();
                    System.out.println("Enter Data");
                    data = sc.nextInt();
                    dll.addAtPos(pos, data);
                    break;

                case 7:

                    System.out.println(dll.countNode());
                    break;

                case 8:

                    dll.printSLL();
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
