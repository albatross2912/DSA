package linkedList;

class Node3
{
    int data;
    Node3 previous;
    Node3 next ;

}

public class Program3 {

    Node3 head;
    Node3 tail;


    void insertFirst(int value)
    {
      Node3 n  = new Node3();
      n.data = value;
      n.next = head;
      n.previous = null;

      if(head!=null)
      {
          head.previous = n;
      }
      if (head == null)
      {
          tail = n;
      }

    }

    void insertlast(int value)
    {
        Node3 n = new Node3();
        n.data = value;
        n.next = null;
        n.previous = tail;
        if (tail != null)
        {
            tail.next = n;
        }
        tail= n;
        if(head==null)
        {
            head = n;
        }

    }
    void deletefirst()
    {
        Node3 n = head;

    }
    void deletelast()
    {
    }
    void displayFirst()
    {
        Node3 tamp = head;
        while (tamp != null)
        {
            System.out.print(tamp.data + "\t ");
            tamp = tamp.next;
        }
        System.out.println();
    }
    void displayLast()
    {

        Node3 tamp = tail;
        while(tamp!=null){
            System.out.print(tamp.data+"\t");
            tamp = tamp.previous;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Program3 p1 = new Program3();
        p1.insertFirst(10);
        p1.insertlast(20);
        p1.insertlast(30);
        p1.insertlast(40);
        p1.displayFirst();
        p1.displayLast();

    }
}
