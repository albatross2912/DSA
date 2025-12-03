package linkedList;

class Node1 {
    int data;
    Node1 next;
}

public class Program2 {

    Node1 head;
    Node1 tail;

    // Insert at beginning
    void insertfirst(int value) {
        Node1 n = new Node1();
        n.data = value;

        if (head == null) {
            head = tail = n;
            tail.next = head;     // circular link
        } else {
            n.next = head;
            head = n;
            tail.next = head;     // maintain circular link
        }
    }

    // Insert at end
    void insertlast(int value) {
        Node1 n = new Node1();
        n.data = value;

        if (head == null) {
            head = tail = n;
            tail.next = head;     // circular link
        } else {
            tail.next = n;
            tail = n;
            tail.next = head;     // maintain circular link
        }
    }

    // Delete first node
    void deletefirst() {
        if (head == null) {
            System.out.println("CLL is empty");
            return;
        }

        if (head == tail) {   // only one node
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;  // maintain circular link
        }
    }

    void deletelast() {
        if (head == tail) {
            System.out.println("CLL is empty");

        }
        else
        {
            Node1 temp = head;
            while (temp.next.next != head)
            {
                temp = temp.next;

            }
            tail = temp;
            tail.next = head;
        }
    }

    // Print circular list
    void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node1 temp = head;

        do {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        } while (temp != head);   // stop when full circle completes

        System.out.println();
    }

    public static void main(String[] args) {

        Program2 p1 = new Program2();
        p1.insertfirst(10);
        p1.insertfirst(20);
        p1.insertfirst(30);

        p1.printlist();     // 30 20 10
        p1.deletefirst();
        p1.printlist();// 20 10
    }
}
