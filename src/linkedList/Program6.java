package linkedList;

import java.util.LinkedList;

public class Program6 {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("james");
        a1.add("peter");
        a1.add("albert");
        a1.add("kapil");
        a1.add("shubham");
        System.out.println(a1); //[james, peter, albert, kapil, shubham]

        a1.set(2,"ajay"); //First it remove existing value then insert a new value
        System.out.println(a1); //[james, peter, ajay, kapil, shubham]

        System.out.println(a1.contains("james")); //True
        System.out.println(a1.contains("James")); //False



    }
}
