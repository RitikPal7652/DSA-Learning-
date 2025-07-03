package DSA.Hashmap.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hp = new HashMap<>();

        hp.put(1, "Aman");
        hp.put(2, "Rohan");
        hp.put(3, "Sohan");
        hp.put(4, "Rahul");

//        System.out.println(hp.get(2));
//        hp.remove(2);
//        if(hp.containsKey(2))
//        System.out.println(hp.get(2));
//        System.out.println(hp.get(3));

        hp.put(2, "ritik");
        System.out.println(hp.get(2));
        System.out.println(hp.size());

        for(Map.Entry<Integer, String> e: hp.entrySet()){
            System.out.println("Key : "+e.getKey()+ "   Value : "+e.getValue());
        }
        System.out.println();
        for(Integer i : hp.keySet())
            System.out.println(i);
        System.out.println();
        for(Integer i: hp.keySet()) System.out.println(hp.get(i));

        for(String i : hp.values()) System.out.println(i);
    }
}
