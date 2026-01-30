import java.util.Scanner;

class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head = null;

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head; // newnode looks at previous first node
            head = newNode; // head now looks at newNode i.e. assigned now at first
        }
    }

    void printSLL() {
        if (head == null) {
            System.out.println("LinkedList is empty");
        } else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println(temp.data);

            // jar asa code lihila tr last cha data print hot nahi karan last chya node cha
            // next null asto ani tyamule aaplyala code chya shevti sout lihayla lagel tya
            // aivaji jr direct temp == null lihila tr mag automatic condition handle keli
            // jail

            // while (temp != null) {
            // System.out.println(temp.data);
            // temp = temp.next;
            // } /// write this type of code on interview
        }
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void addAtPos(int pos, int data) {

        if (pos <= 0 || pos >= countNode() + 2) {
            System.out.println("WrongInput");
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

        if (head == null) {
            System.out.println("LinkedList is Empty");
        } else if (countNode() == 1) {
            head = null;
        } else {
            head = head.next;
        }

    }

    void deleteLast() {

        if (head == null) {
            System.out.println("LinkedList is Empty");
        } else if (countNode() == 1) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

    }

    void deleteAtPos(int pos) {
        if (pos <= 0 || pos >= countNode() + 1) {
            System.out.println("Wrong Input");
            return;
        }

        if (pos == 1) {
            deleteFirst();
        } else if (pos == countNode()) {
            deleteLast();
        } else {
            Node temp = head;

            while (pos - 2 != 0) {
                temp = temp.next;
                pos--;
            }

            // for (int i = 1; i < pos - 1; i++) {
            // temp = temp.next;
            // }

            temp.next = temp.next.next;
        }

    }

    int countNode() {
        int count = 0;

        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

}

public class Linked {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(10);
        // ll.addFirst(20);
        // ll.addFirst(30);
        // ll.printSLL();

        // System.out.print(ll.countNode());
        // System.out.println();

        // ll.addLast(15);
        // ll.printSLL();
        // System.out.println(ll.countNode()); // Print SinglyLinkedList
        // System.out.println();

        // ll.addAtPos(5, 25);
        // ll.printSLL();
        // System.out.println(ll.countNode());

        // System.out.println();
        // ll.deleteFirst();
        // ll.printSLL();

        // System.out.println();
        // ll.deleteLast();
        // ll.printSLL();

        // System.out.println();
        // ll.deleteAtPos(2);
        // ll.printSLL();

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
            System.out.println("8.Print Singly Linked List");
            int choice = sc.nextInt();
            int data;
            switch (choice) {
                case 1:

                    System.out.println("Enter Data");
                    data = sc.nextInt();
                    ll.addFirst(data);
                    break;

                case 2:

                    System.out.println("Enter Data");
                    data = sc.nextInt();
                    ll.addLast(data);
                    break;

                case 3:

                    System.out.println("Enter Data");
                    data = sc.nextInt();
                    ll.addAtPos(choice, data);
                    break;

                case 4:

                    ll.deleteFirst();
                    break;

                case 5:

                    ll.deleteLast();
                    break;

                case 6:

                    System.out.println("Enter Position");
                    int pos = sc.nextInt();
                    System.out.println("Enter Data");
                    data = sc.nextInt();
                    ll.addAtPos(pos, data);
                    break;

                case 7:

                    System.out.println(ll.countNode());
                    break;

                case 8:

                    ll.printSLL();
                    System.out.println();
                    break;

                default:
                    break;

            }

            System.out.println("Do you want to continue? (y/n)");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        sc.close();
    }
}

// THERE ARE TWO TYPES OF WRITING THE LINKEDLIST CODE
// 1). COMPOSITION -> THE CLASS NODE IS WRITTEN SEPRATELY
// 2). INNER CLASS - THE CLASS NODE IS WRITTEN IN LINKEDLIST CLASS