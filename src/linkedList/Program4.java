package linkedList;

import java.util.LinkedList;

public class Program4 {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("james");
        a1.add("peter");
        a1.add("albert");
        a1.add("kapil");
        a1.add("shubham");

        System.out.println(a1);
        a1.addFirst("Rojar");
        a1.addLast("Isha");
        System.out.println(a1);
        System.out.println(a1.get(1));
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
        System.out.println(a1.size());
        a1.clear();
        System.out.println(a1);

    }
}
