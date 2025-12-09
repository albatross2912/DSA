package linkedList;

import java.util.LinkedList;

public class Program5 {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("james");
        a1.add("peter");
        a1.add("albert");
        a1.add("kapil");
        a1.add("shubham");
        System.out.println(a1);

        a1.remove(2);
        System.out.println(a1);
        a1.removeFirst();
        a1.removeLast();
        System.out.println(a1);



    }
}
