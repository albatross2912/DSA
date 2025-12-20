package collectionframework;


import java.util.HashMap;

public class Program7 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(213, "Ajay");
        map.put(512, "Vijay");
        map.put(111, "Adam");
        map.put(99, "Maria");

        System.out.println(map);

        System.out.println(map.containsKey(99));
        System.out.println(map.containsKey(199));
        System.out.println(map.containsValue("Pooja"));
        System.out.println(map.containsValue("Maria"));


        System.out.println(map.keySet());

        System.out.println(map.entrySet());



     }

}
