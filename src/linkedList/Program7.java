package linkedList;

import java.util.LinkedList;

public class Program7 {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("james");
        a1.add("peter");
        a1.add("albert");
        a1.add("kapil");
        a1.add("shubham");
        System.out.println(a1); //[james, peter, albert, kapil, shubham]

        LinkedList<String> a2 = new LinkedList<>();
        a2.add("Sahil");
        a2.add("sumit");
        a2.addAll(a1); //[Sahil, sumit, james, peter, albert, kapil, shubham]
        System.out.println(a2);

        LinkedList a3 = (LinkedList) a2.clone(); // For Clone any LinkedList
        System.out.println(a3);







    }
}
