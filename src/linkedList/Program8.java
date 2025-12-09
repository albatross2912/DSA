package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Program8 {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("james");
        a1.add("peter");
        a1.add("albert");
        a1.add("kapil");
        a1.add("shubham");
        System.out.println(a1); //[james, peter, albert, kapil, shubham]

        ListIterator itr  =a1.listIterator(); //instant factory method
        while( itr.hasNext())
        {
            System.out.println(itr.next()+ " ");
        }

        while(itr.hasPrevious())
        {
            System.out.println(itr.previous()+ " ");
        }




    }
}
