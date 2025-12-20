package collectionframework;

import java.util.HashMap;

public class Program6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(213, "ajay");
        map.put(512, "vijay");
        map.put(111, "adam");
        map.put(99, "maria");
        System.out.println(map);
        System.out.println(map.get(512));
        System.out.println(map.remove(111));
        System.out.println(map);


        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);
    }
}

