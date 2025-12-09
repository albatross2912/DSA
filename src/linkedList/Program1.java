package linkedlist;

class Node
{
    int data;
    Node next;
}

public class Program1 {

    Node head;

    void insertFirst(int value)
    {
        Node n = new Node();
        n.data = value;
        n.next = head;
        head = n;
    }

    void insertLast(int value)
    {
        Node n = new Node();
        n.data = value;
        n.next = null;

        if(head == null) {
            head = n;
        }
        else {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    void deleteFirst()
    {
        if(head == null)
            System.out.println("LL is Empty");
        else
            head = head.next;
    }

    void deleteLast()
    {
        if(head == null)
        {
            System.out.println("LL is Empty");
        }
        else if(head.next == null)
        {
            head = null;
        }
        else
        {
            Node temp = head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }

    int searchElement(int value)
    {
        int pos = 1;
        Node temp = head;

        while(temp != null)
        {
            if(temp.data == value)
                return pos;

            temp = temp.next;
            pos++;
        }
        return -1;
    }

    int intCountNode()
    {
        int count = 0;
        Node temp = head;

        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Remove duplicate elements (unsorted list)
    void removeDuplicate()
    {
        Node curr = head;

        while(curr != null)
        {
            Node temp = curr;
            while(temp.next != null)
            {
                if(temp.next.data == curr.data)
                {
                    temp.next = temp.next.next;  // delete duplicate node
                }
                else
                {
                    temp = temp.next;
                }
            }
            curr = curr.next;
        }
    }

    // Find middle node (returns data)
    int findMiddleNode()
    {
        if (head == null)
            return -1;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;   // middle node value
    }

    // Insert in the middle
    void insertMiddle(int value)
    {
        Node n = new Node();
        n.data = value;

        if(head == null)
        {
            head = n;
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        n.next = slow.next;
        slow.next = n;
    }

    public static void main(String[] args) {

        Program1 p1 = new Program1();

        p1.insertFirst(10);
        p1.insertFirst(20);
        p1.insertFirst(30);
        p1.insertLast(40);
        p1.insertFirst(50);

        p1.printList();

        p1.insertMiddle(60);

        p1.printList();

        System.out.println("Middle Node = " + p1.findMiddleNode());
        System.out.println("Total Nodes = " + p1.intCountNode());
    }
}
