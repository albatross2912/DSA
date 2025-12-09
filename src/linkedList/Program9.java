package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Program9 {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("james");
        a1.add("peter");
        a1.add("albert");
        a1.add("kapil");
        a1.add("shubham");
        System.out.println(a1); //[james, peter, albert, kapil, shubham]

        Iterator itr  = a1.descendingIterator();
        while( itr.hasNext())
        {
            System.out.println(itr.next()+ " ");
        }





    }
}
