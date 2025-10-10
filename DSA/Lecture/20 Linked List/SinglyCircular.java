import java.util.Scanner;

class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class SinglyCircularLinkedList {
    Node head = null;

    void addFirst(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }

    }

    void addLast(int data) {
        Node temp = head;

        if (head == null) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;

        }
    }

    void addAtPos(int pos, int data) {

        if (head == null) {
            System.out.println("LinkedList Empty!!!");
            return;
        }

        if (pos == 1) {
            addFirst(data);
        } else if (pos == countNode() + 1) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;

            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }

            newNode.next = temp.next;
            temp.next = newNode;

        }

    }

    void deleteFirst() {
        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        if (head == null) {
            System.out.println("LinkedList already empty");
        } else if (countNode() == 1) {
            head = null;
        } else {
            head = head.next;
            temp.next = head;
        }
    }

    void deleteLast() {
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next.next = null;
        temp.next = head;
    }

    void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("LinkedList Empty!!!");
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

        }
    }

    int countNode() {

        int countNode = 0;
        Node temp = head;

        if (head == null) {
            return 0;
        } else {

            while (temp.next != head) {
                countNode++;
                temp = temp.next;
            }
            countNode++;
            return countNode;
        }

    }

    void printSCLL() {
        Node temp = head;

        while (temp.next != head) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }

}

public class SinglyCircular {
    public static void main(String[] args) {
        SinglyCircularLinkedList scll = new SinglyCircularLinkedList();
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
            System.out.println("8.Print Singly Circular Linked List");
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

                    System.out.println("Enter Data");
                    pos = sc.nextInt();
                    scll.deleteAtPos(pos);
                    break;

                case 7:

                    System.out.println(scll.countNode());
                    break;

                case 8:

                    scll.printSCLL();
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
